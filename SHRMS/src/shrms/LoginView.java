/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shrms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.sql.*;


/**
 *
 * @author 泊
 */
public class LoginView extends JFrame {

    JLabel nameLabel = new JLabel("学校人力资源管理系统", JLabel.CENTER);
    SpringLayout springLayout = new SpringLayout();
    JPanel centerPanel = new JPanel(springLayout);
    JLabel userNameLabel = new JLabel("用户名：");
    JTextField userTxt = new JTextField();
    JLabel pwdLabel = new JLabel("密码：");
    JPasswordField pwdField = new JPasswordField();
    JButton loginBth = new JButton("登陆");
    JButton resetBtn = new JButton("重置");

    //加入系统托盘
    SystemTray systemTray;
    TrayIcon trayIcon;
    //连接数据库

    private Connection con;
    private Statement sta;
    private ResultSet rs;

    public LoginView() {
        super("学校人力资源管理系统");

        Container contentPanel = getContentPane();

        nameLabel.setFont(new Font("华文行楷", Font.PLAIN, 40));
        nameLabel.setPreferredSize(new Dimension(0, 80));

        Font centerFont = new Font("楷体", Font.PLAIN, 20);
        userNameLabel.setFont(centerFont);
        userTxt.setPreferredSize(new Dimension(200, 30));
        pwdLabel.setFont(centerFont);
        pwdField.setPreferredSize(new Dimension(200, 30));
        loginBth.setFont(centerFont);

        resetBtn.setFont(centerFont);
        //把组件加入内容面板
        centerPanel.add(userNameLabel);
        centerPanel.add(userTxt);
        centerPanel.add(pwdLabel);
        centerPanel.add(pwdField);
        //增加按键
        centerPanel.add(loginBth);
        centerPanel.add(resetBtn);

        //弹簧布局
        //布局userNameLabel
        Spring childWidth = Spring.sum(Spring.sum(Spring.width(userNameLabel), Spring.width(userTxt)), Spring.constant(20));
        int offsetX = childWidth.getValue() / 2;
        springLayout.putConstraint(SpringLayout.WEST, userNameLabel, -offsetX, SpringLayout.HORIZONTAL_CENTER, centerPanel);
        springLayout.putConstraint(SpringLayout.NORTH, userNameLabel, 20, SpringLayout.NORTH, centerPanel);
        //布局userTxt
        springLayout.putConstraint(SpringLayout.WEST, userTxt, 20, SpringLayout.EAST, userNameLabel);
        springLayout.putConstraint(SpringLayout.NORTH, userTxt, 0, SpringLayout.NORTH, userNameLabel);
        //布局pwdLabel
        springLayout.putConstraint(SpringLayout.EAST, pwdLabel, 0, SpringLayout.EAST, userNameLabel);
        springLayout.putConstraint(SpringLayout.NORTH, pwdLabel, 20, SpringLayout.SOUTH, userNameLabel);
        //布局pwdField
        springLayout.putConstraint(SpringLayout.WEST, pwdField, 20, SpringLayout.EAST, pwdLabel);
        springLayout.putConstraint(SpringLayout.NORTH, pwdField, 0, SpringLayout.NORTH, pwdLabel);
        //布局loginBth
        springLayout.putConstraint(SpringLayout.WEST, loginBth, 50, SpringLayout.WEST, pwdLabel);
        springLayout.putConstraint(SpringLayout.NORTH, loginBth, 20, SpringLayout.SOUTH, pwdLabel);
        //布局resetBtn
        springLayout.putConstraint(SpringLayout.WEST, resetBtn, 50, SpringLayout.EAST, loginBth);
        springLayout.putConstraint(SpringLayout.NORTH, resetBtn, 0, SpringLayout.NORTH, loginBth);

        contentPanel.add(nameLabel, BorderLayout.NORTH);
        contentPanel.add(centerPanel, BorderLayout.CENTER);
        

        
        //添加系统托盘图标
        if (SystemTray.isSupported()) {
            systemTray = SystemTray.getSystemTray();
            URL imgUrl = LoginView.class.getClassLoader().getResource("\\image\\3.jpg");
            trayIcon = new TrayIcon(new ImageIcon(imgUrl).getImage());
            trayIcon.setImageAutoSize(true);
            try {
                systemTray.add(trayIcon);
            } catch (AWTException e) {
                e.printStackTrace();
            }
            this.addWindowListener(new WindowAdapter() {
                @Override
                public void windowIconified(WindowEvent e) {
                    LoginView.this.dispose();
                }
            });
            trayIcon.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int clickCount = e.getClickCount();
                    if (clickCount == 1) {
                        LoginView.this.setExtendedState(JFrame.NORMAL);
                    }
                    LoginView.this.setVisible(true);
                }
            });
            //给loginBtn添加事件
            //匿名内部类
            loginBth.addActionListener(new AbstractAction() {
                @Override

                public void actionPerformed(ActionEvent e) {
                    String tno, pwd;
                    tno = userTxt.getText();
                    pwd = pwdField.getText();

                    try {
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    } catch (ClassNotFoundException ex) {
                        System.out.println(ex);
                    }
                    try {
                        Connection con;
                        Statement sql;
                        ResultSet rs;
                        String url, userName, userPwd;
                        url = "jdbc:sqlserver://localhost:1433;DatabaseName=SHRMS";
                        userName = "sa";
                        userPwd = "123456";
                        con = DriverManager.getConnection(url, userName, userPwd);
                        sql = con.createStatement();
                        String strSQL = "select * from login where tno='" + tno + "' and pwd='" + pwd + "'";
                        rs = sql.executeQuery(strSQL);
                        int q = 0;
                        while (rs.next()) {
                            if (rs.getString("tno").trim().equals(tno.trim()) && rs.getString("pwd").trim().equals(pwd.trim())) {
                                q++;
                                break;
                            }
                        }
                        if (q > 0) {
                            JOptionPane.showMessageDialog(null, "登陆成功！", "消息对话框", JOptionPane.WARNING_MESSAGE);
                            dispose();
                            new MainView();
                        } else {
                            JOptionPane.showMessageDialog(null, "账号或者密码错误!", "消息对话框", JOptionPane.WARNING_MESSAGE);
                        }
                    } catch (SQLException exp) {
                        System.out.println(exp);
                    }

                }
                
                

            });
            resetBtn.addActionListener(new AbstractAction() {
                @Override

                public void actionPerformed(ActionEvent e) {
                    userTxt.setText("");
                    pwdField.setText("");
                    JOptionPane.showMessageDialog(null, "重置成功！", "消息对话框", JOptionPane.WARNING_MESSAGE);
                    
                }
                
                

            });

        }

        //窗体图标插入图片
        URL imgUrl = LoginView.class.getClassLoader().getResource("\\image\\3.jpg");
        setIconImage(new ImageIcon(imgUrl).getImage());
        //设置窗体大小
        setSize(600, 400);
        //显示窗体
        setVisible(true);
        //居中显示；
        setLocationRelativeTo(null);
        //点击×时退出程序；
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //大小不可改变
        setResizable(false);
        ImageIcon img = new ImageIcon("\\image\\2.jpg");
        JLabel jl_bg = new JLabel(img);
        jl_bg.setBounds(0, 0, 400, 400);
        getLayeredPane().add(jl_bg, new Integer(Integer.MIN_VALUE));
        ((JPanel) this.getContentPane()).setOpaque(false);

    }

    public static void main(String[] args) {
        new LoginView();
    }


}
