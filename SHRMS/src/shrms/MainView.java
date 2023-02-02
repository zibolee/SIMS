/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shrms;

import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author 泊
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form CommFrame
     */
    public MainView() {
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("学校人力资源管理系统");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setFont(new java.awt.Font("楷体", 0, 48)); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1.jpg"))); // NOI18N

        jMenuBar1.setFont(new java.awt.Font("新宋体", 0, 48)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(800, 50));

        jMenu1.setText("部门信息");
        jMenu1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(160, 24));

        jMenuItem1.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenuItem1.setText("查询");
        jMenuItem1.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenuItem3.setText("修改");
        jMenuItem3.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenu1.add(jMenuItem3);

        jMenuItem2.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenuItem2.setText("添加");
        jMenuItem2.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenuItem4.setText("删除");
        jMenuItem4.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("职工信息");
        jMenu2.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(160, 24));

        jMenuItem9.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenuItem9.setText("查询");
        jMenuItem9.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenuItem10.setText("添加");
        jMenuItem10.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenu2.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenuItem11.setText("修改");
        jMenuItem11.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenu2.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenuItem12.setText("删除");
        jMenuItem12.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("职工教育经历");
        jMenu5.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(180, 24));

        jMenuItem5.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenuItem5.setText("查询");
        jMenuItem5.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenuItem6.setText("添加");
        jMenuItem6.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenu5.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenuItem7.setText("修改");
        jMenuItem7.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenu5.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenuItem8.setText("删除");
        jMenuItem8.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenu5.add(jMenuItem8);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("职工奖惩");
        jMenu6.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(160, 24));

        jMenuItem13.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenuItem13.setText("查询");
        jMenuItem13.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenuItem14.setText("添加");
        jMenuItem14.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenu6.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenuItem15.setText("修改");
        jMenuItem15.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenu6.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenuItem16.setText("删除");
        jMenuItem16.setPreferredSize(new java.awt.Dimension(160, 40));
        jMenu6.add(jMenuItem16);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("关于我们");
        jMenu7.setFont(new java.awt.Font("新宋体", 0, 24)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(160, 24));
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new SdeptView();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MainView();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new TeacherView();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new SchoolView();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new RewardView();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}