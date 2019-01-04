/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyms;

import javax.swing.JOptionPane;
import jyms.data.SysParaCodesBean;
import jyms.tools.endecrypt.LicenseGenerator;

/**
 *
 * @author John
 */
public class JDialogLicense extends javax.swing.JDialog {

    private final String sFileName = this.getClass().getName() + ".java";
    private boolean RegisterSucc = false;
    /**
     * Creates new form JDialogLicense
     * @param parent
     * @param modal
     * @param MachineCode
     */
    public JDialogLicense(java.awt.Frame parent, boolean modal, String MachineCode) {
        super(parent, modal);
        initComponents();
        modifyLocales();
        jTextAreaMachineCode.setText(MachineCode==null?"":MachineCode);
        initialParas();
    }
    
    private void initialParas(){
        CommonParas.setJButtonUnDecorated(jButtonExit1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMachineCode = new javax.swing.JTextArea();
        jLabelMachineCode = new javax.swing.JLabel();
        jLabelRegistrationCode = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaMessage = new javax.swing.JTextArea();
        jButtonRegister = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaLicense = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jButtonExit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("请输入注册码");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);

        jTextAreaMachineCode.setEditable(false);
        jTextAreaMachineCode.setColumns(20);
        jTextAreaMachineCode.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jTextAreaMachineCode.setLineWrap(true);
        jTextAreaMachineCode.setRows(3);
        jTextAreaMachineCode.setText(".5CL2L82.CN486436C10456.;BFEBFBFF000406E3;A81BDAFC5C069BE9B90667F22BF2197B");
        jScrollPane1.setViewportView(jTextAreaMachineCode);

        jLabelMachineCode.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jLabelMachineCode.setText("机器码：");

        jLabelRegistrationCode.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jLabelRegistrationCode.setText("注册码：");

        jScrollPane2.setAutoscrolls(true);

        jTextAreaMessage.setEditable(false);
        jTextAreaMessage.setColumns(20);
        jTextAreaMessage.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jTextAreaMessage.setLineWrap(true);
        jTextAreaMessage.setRows(5);
        jTextAreaMessage.setText("您可以通过QQ或者电话和我公司联系，以获取相应的软件使用许可。");
        jTextAreaMessage.setAutoscrolls(false);
        jTextAreaMessage.setBorder(null);
        jScrollPane2.setViewportView(jTextAreaMessage);

        jButtonRegister.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jButtonRegister.setText("注册");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jButtonExit.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jButtonExit.setText("退出");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jTextAreaLicense.setColumns(20);
        jTextAreaLicense.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jTextAreaLicense.setLineWrap(true);
        jTextAreaLicense.setRows(5);
        jTextAreaLicense.setText("009351A55117EDB66A1D2B890F16215B320EAC493709060981265265C23F9FD6A3AFA33E0810E4184FD35D63F902A2FE712E1BEEFF65A22A23F613FC4FC90456FD0495B8D070134F5E54D10FDC35C7D5C2DE2066748D2DCC709C1AB4AE7AF515A8D01991EAA167079D59B4048619140D4E70A58A711B0B62DBB4B5F62D44F82B");
        jScrollPane4.setViewportView(jTextAreaLicense);

        jLabelTitle.setFont(new java.awt.Font("微软雅黑", 1, 18)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("请输入注册码");

        jButtonExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jyms/image/close.png"))); // NOI18N
        jButtonExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMachineCode, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRegistrationCode, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonExit, jButtonRegister});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMachineCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelRegistrationCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExit1ActionPerformed
        // TODO add your handling code here:
        jButtonExit.doClick();
    }//GEN-LAST:event_jButtonExit1ActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        // TODO add your handling code here:
        String TmpMachineCode = jTextAreaMachineCode.getText();
        String MachineCode = TmpMachineCode.substring(TmpMachineCode.length()-32, TmpMachineCode.length());
        String License = LicenseGenerator.generateLicense(MachineCode);
        String License2 = jTextAreaLicense.getText().trim();
        if (License.equals(License2)){
            if (SysParaCodesBean.updateSysParaValue(CommonParas.SysParas.SYSPARAS_COMMON_REGCODE_CODE, License, sFileName)>0){
                RegisterSucc = true;
                JOptionPane.showMessageDialog(rootPane, sRegisterSucc);// "恭喜您已经成功注册！"
                this.dispose();
            }else {
                JOptionPane.showMessageDialog(rootPane, sRegisterFail);// "把注册码写入程序过程中出现错误！"
            }
        }else
            JOptionPane.showMessageDialog(rootPane, sRegCodeError);//"注册码错误！"
    }//GEN-LAST:event_jButtonRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogLicense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogLicense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogLicense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogLicense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogLicense dialog = new JDialogLicense(new javax.swing.JFrame(), true,"");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    /**
        * 函数:      modifyLocales
        * 函数描述:  根据系统语言设置窗口的控件信息和消息文本
    */
    private void modifyLocales(){
        
        if (CommonParas.SysParas.ifChinese) return;//如果是中文，则不做任何操作
        
        MyLocales Locales = CommonParas.SysParas.sysLocales;
        
        //信息显示
        sTitle = Locales.getString("ClassStrings", "JDialogLicense.sTitle");  //请输入注册码
        sRegisterSucc = Locales.getString("ClassStrings", "JDialogLicense.sRegisterSucc");  //恭喜您已经成功注册！
        sRegisterFail = Locales.getString("ClassStrings", "JDialogLicense.sRegisterFail");  //把注册码写入程序过程中出现错误！
        sRegCodeError = Locales.getString("ClassStrings", "JDialogLicense.sRegCodeError");  //注册码错误！
        //标签和按钮显示
        jLabelMachineCode.setText( Locales.getString("ClassStrings", "JDialogLicense.jLabelMachineCode"));  //机器码：
        jLabelRegistrationCode.setText( Locales.getString("ClassStrings", "JDialogLicense.jLabelRegistrationCode"));  //注册码：
        jTextAreaMessage.setText( Locales.getString("ClassStrings", "JDialogLicense.jTextAreaMessage"));  //您可以通过QQ或者电话联系我公司，以获取相应的软件使用许可。
        jButtonRegister.setText( Locales.getString("ClassStrings", "JDialogLicense.jButtonRegister"));  //注册
        jButtonExit.setText( Locales.getString("ClassStrings", "JDialogLicense.jButtonExit"));  //退出

        //国际化后设置
        this.setTitle(sTitle);  //请输入注册码
        jLabelTitle.setText(sTitle);  //请输入注册码
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonExit1;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabelMachineCode;
    private javax.swing.JLabel jLabelRegistrationCode;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextAreaLicense;
    private javax.swing.JTextArea jTextAreaMachineCode;
    private javax.swing.JTextArea jTextAreaMessage;
    // End of variables declaration//GEN-END:variables

    private String sTitle = "请输入注册码";
    private String sRegisterSucc = "恭喜您已经成功注册！";
    private String sRegisterFail = "把注册码写入程序过程中出现错误！";
    private String sRegCodeError = "注册码错误！";
    /**
     * @return the RegisterSucc
     */
    public boolean isRegisterSucc() {
        return RegisterSucc;
    }
}