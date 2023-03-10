/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shrms;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author 泊
 */
public class SdeptView extends javax.swing.JFrame {

    /**
     * Creates new form SdeptView
     */
    public SdeptView() {
        initComponents();

        setVisible(true);
        setLocationRelativeTo(null);
        //窗体图标插入图片
        URL imgUrl = LoginView.class.getClassLoader().getResource("\\image\\3.jpg");
        setIconImage(new ImageIcon(imgUrl).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        snoTxt = new javax.swing.JTextField();
        snameTxt = new javax.swing.JTextField();
        stnoTxt = new javax.swing.JTextField();
        tnoTxt = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        insertBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        selBth = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("部门信息查询");

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("部门编号：");
        jLabel1.setPreferredSize(new java.awt.Dimension(120, 40));

        jLabel2.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel2.setText("部门名称：");
        jLabel2.setPreferredSize(new java.awt.Dimension(120, 40));

        jLabel3.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel3.setText("部门邮箱：");
        jLabel3.setPreferredSize(new java.awt.Dimension(120, 40));

        jLabel4.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel4.setText("部门领导：");
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 40));

        snoTxt.setPreferredSize(new java.awt.Dimension(150, 40));

        snameTxt.setPreferredSize(new java.awt.Dimension(150, 40));

        stnoTxt.setPreferredSize(new java.awt.Dimension(150, 40));
        stnoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stnoTxtActionPerformed(evt);
            }
        });

        tnoTxt.setPreferredSize(new java.awt.Dimension(150, 40));

        updateBtn.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        updateBtn.setText("修改");
        updateBtn.setPreferredSize(new java.awt.Dimension(100, 40));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        insertBtn.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        insertBtn.setText("添加");
        insertBtn.setPreferredSize(new java.awt.Dimension(100, 40));
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        delBtn.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        delBtn.setText("删除");
        delBtn.setPreferredSize(new java.awt.Dimension(100, 40));
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        selBth.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        selBth.setText("查询");
        selBth.setPreferredSize(new java.awt.Dimension(100, 40));
        selBth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selBthActionPerformed(evt);
            }
        });

        backBtn.setText("返回");
        backBtn.setPreferredSize(new java.awt.Dimension(80, 40));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(snoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(snameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stnoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tnoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selBth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(snoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(snameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(stnoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(tnoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selBth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MainView();
    }//GEN-LAST:event_backBtnActionPerformed

    private void selBthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selBthActionPerformed
        // TODO add your handling code here:

        try {
            Connection con;
            Statement sql;
            String url, userName, userPwd;
            url = "jdbc:sqlserver://localhost:1433;DatabaseName=SHRMS";
            userName = "sa";
            userPwd = "123456";
            con = DriverManager.getConnection(url, userName, userPwd);
            sql = con.createStatement();

            String strSQL = "(Select * from sdept where sno='" + snoTxt.getText() + "' )";
            ResultSet rs = sql.executeQuery(strSQL);
            System.out.print(rs);

            if (rs.next()) {
                snoTxt.setText(rs.getString("sno"));
                snameTxt.setText(rs.getString("sname"));
                stnoTxt.setText(rs.getString("stno"));
                tnoTxt.setText(rs.getString("tno"));
                JOptionPane.showMessageDialog(null, "查询成功");
            } else {
                JOptionPane.showMessageDialog(null, "您查询的信息不存在，请重新输入");
            }
            con.close();
            //关闭数据库连接	
        } catch (SQLException ex) {
            System.out.println(ex);
        }


    }//GEN-LAST:event_selBthActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        // TODO add your handling code here:
        String sno = snoTxt.getText();
        String sname = snameTxt.getText();
        String stno = stnoTxt.getText();
        String tno = tnoTxt.getText();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        try {
            Connection con;
            Statement sql;
            String url, userName, userPwd;
            url = "jdbc:sqlserver://localhost:1433;DatabaseName=SHRMS";
            userName = "sa";
            userPwd = "123456";
            con = DriverManager.getConnection(url, userName, userPwd);
            sql = con.createStatement();
            Statement st = con.createStatement();
            String strSQL = "insert into sdept values('" + sno + "','" + sname + "','" + stno + "','" + tno + "');";
            int rs = st.executeUpdate(strSQL);
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "添加成功");
            } else {
                JOptionPane.showMessageDialog(null, "添加失败");
            }
            con.close();
            //关闭数据库连接
        } catch (SQLException exp) {
            System.out.println();
        }
    }//GEN-LAST:event_insertBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        String updatesname = snameTxt.getText();
        String updatestno = stnoTxt.getText();
        String updatetno = tnoTxt.getText();
        String updatesno = snoTxt.getText();

        try {
            Connection con;
            Statement sql;
            String url, userName, userPwd;
            url = "jdbc:sqlserver://localhost:1433;DatabaseName=SHRMS";
            userName = "sa";
            userPwd = "123456";
            con = DriverManager.getConnection(url, userName, userPwd);
            sql = con.createStatement();
            Statement st = con.createStatement();

            String strSQL1 = "update sdept set sname='" + updatesname + "' where sno='" + updatesno + "'";
            String strSQL2 = "update sdept set stno='" + updatestno + "' where sno='" + updatesno + "'";
            String strSQL3 = "update sdept set tno='" + updatetno + "' where sno='" + updatesno + "'";

            int rs1 = st.executeUpdate(strSQL1);
            int rs2 = st.executeUpdate(strSQL2);
            int rs3 = st.executeUpdate(strSQL3);
            if (rs1 == 1 && rs2 == 1 && rs3 == 1) {
                JOptionPane.showMessageDialog(null, "修改成功");
            } else {
                JOptionPane.showMessageDialog(null, "修改失败");
            }
            con.close();

            //关闭数据库连接	
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_updateBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
        String delsno = snoTxt.getText();

        try {
            Connection con;
            Statement sql;
            String url, userName, userPwd;
            url = "jdbc:sqlserver://localhost:1433;DatabaseName=SHRMS";
            userName = "sa";
            userPwd = "123456";
            con = DriverManager.getConnection(url, userName, userPwd);
            sql = con.createStatement();
            Statement st = con.createStatement();

            String strSQL = "delete  from  sdept where sno='" + delsno + "' ";

            int rs = st.executeUpdate(strSQL);
            if (rs == 1) {
                JOptionPane.showMessageDialog(null, "删除成功");
            } else {
                JOptionPane.showMessageDialog(null, "删除失败");
            }
            con.close();

            //关闭数据库连接	
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void stnoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stnoTxtActionPerformed
        // TODO add your handling code here:
        E_mail E = new E_mail();
        Judge M = new Judge();
        if (stnoTxt.getText().matches("[a-zA-Z0-9_]+@{1}[a-z]+[.]{1}[a-z]+")) {
            JOptionPane.showMessageDialog(null, "输入合法！", "消息对话框", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "输入不合法！", "消息对话框", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_stnoTxtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SdeptView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SdeptView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SdeptView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SdeptView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SdeptView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton selBth;
    private javax.swing.JTextField snameTxt;
    private javax.swing.JTextField snoTxt;
    private javax.swing.JTextField stnoTxt;
    private javax.swing.JTextField tnoTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
