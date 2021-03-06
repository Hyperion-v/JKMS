/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jyms;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import jyms.data.CodesBean;
import jyms.ui.PanelUI_LineBorder;
import jyms.ui.PanelUI_MatteBorder;

/**
 *
 * @author John
 */
public class JDialogDeviceType extends javax.swing.JDialog {
    
    private final String sFileName = this.getClass().getName() + ".java";
    private ArrayList<CodesBean> listDeviceCodesBean;//获取代码表中的所有设备类型列表，包括“代码”,“代码名称”,“上级代码”,“备注”等参数
    private ArrayList<String> listDeviceCodeName = new ArrayList<String>();
    private ArrayList<Integer> listAllCheckState = new ArrayList<Integer>();//所有的状态1选中；0未选中
    private int iState = 0;
    /**
     * Creates new form JDialogDeviceType
     */
    public JDialogDeviceType(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        modifyLocales();
        initialJFrameParas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFirst = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jPanelLast = new javax.swing.JPanel();
        jButtonOk = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanelCenter = new javax.swing.JPanel();
        jPanelNorth = new javax.swing.JPanel();
        jLabelSelectDevType = new javax.swing.JLabel();
        jPanelContainer = new javax.swing.JPanel();
        jPanelDeviceTypeContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("添加设备类型");
        setUndecorated(true);
        setResizable(false);

        jLabelTitle.setFont(new java.awt.Font("微软雅黑", 1, 18)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("添加设备类型");

        jButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jyms/image/close.png"))); // NOI18N
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFirstLayout = new javax.swing.GroupLayout(jPanelFirst);
        jPanelFirst.setLayout(jPanelFirstLayout);
        jPanelFirstLayout.setHorizontalGroup(
            jPanelFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFirstLayout.createSequentialGroup()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelFirstLayout.setVerticalGroup(
            jPanelFirstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFirstLayout.createSequentialGroup()
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelFirst, java.awt.BorderLayout.PAGE_START);

        jButtonOk.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jButtonOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jyms/image/ok.png"))); // NOI18N
        jButtonOk.setText("确定");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jButtonCancel.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jyms/image/cancel.png"))); // NOI18N
        jButtonCancel.setText("取消");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLastLayout = new javax.swing.GroupLayout(jPanelLast);
        jPanelLast.setLayout(jPanelLastLayout);
        jPanelLastLayout.setHorizontalGroup(
            jPanelLastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLastLayout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addComponent(jButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelLastLayout.setVerticalGroup(
            jPanelLastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLastLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanelLastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanelLast, java.awt.BorderLayout.PAGE_END);

        jPanelCenter.setLayout(new java.awt.BorderLayout());

        jLabelSelectDevType.setFont(new java.awt.Font("微软雅黑", 1, 16)); // NOI18N
        jLabelSelectDevType.setText("选择要添加的设备类型：");

        javax.swing.GroupLayout jPanelNorthLayout = new javax.swing.GroupLayout(jPanelNorth);
        jPanelNorth.setLayout(jPanelNorthLayout);
        jPanelNorthLayout.setHorizontalGroup(
            jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
            .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNorthLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelSelectDevType, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)))
        );
        jPanelNorthLayout.setVerticalGroup(
            jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelNorthLayout.createSequentialGroup()
                    .addComponent(jLabelSelectDevType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanelCenter.add(jPanelNorth, java.awt.BorderLayout.NORTH);

        jPanelContainer.setLayout(new java.awt.BorderLayout());

        jPanelDeviceTypeContainer.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelDeviceTypeContainerLayout = new javax.swing.GroupLayout(jPanelDeviceTypeContainer);
        jPanelDeviceTypeContainer.setLayout(jPanelDeviceTypeContainerLayout);
        jPanelDeviceTypeContainerLayout.setHorizontalGroup(
            jPanelDeviceTypeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        jPanelDeviceTypeContainerLayout.setVerticalGroup(
            jPanelDeviceTypeContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        jPanelContainer.add(jPanelDeviceTypeContainer, java.awt.BorderLayout.CENTER);

        jPanelCenter.add(jPanelContainer, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanelCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        iState = -2;//说明没有选择设备类型
        this.dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        // TODO add your handling code here:
        ArrayList<String> listReturn = new ArrayList<String>();
        for (int i=0;i<listAllCheckState.size();i++){
            if (listAllCheckState.get(i) == 1) {
                CodesBean codesBean = listDeviceCodesBean.get(i);
                listReturn.add(codesBean.getCode());
                listDeviceCodeName.add(codesBean.getCode());
            }
        }
        //System.out.println(listDeviceCodeName.toString());
        int SetRemarks = -1;
        if (listReturn.size() > 0) {
            SetRemarks = CodesBean.setRemarksList(listReturn,"1",this.sFileName);
        
            if (SetRemarks > 0) {
                iState = 1;//说明增加类型成功
            }else iState = SetRemarks;//说明增加类型失败
        }else iState = -2;//说明没有选择设备类型
        this.dispose();
    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        iState = -2;//说明没有选择设备类型
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed
    
    private void initialJFrameParas(){
        listDeviceCodesBean = CodesBean.getCodesList(CommonParas.DVRType.DVRTYPE_CODE, "", this.sFileName);
        for (int i=0;i<listDeviceCodesBean.size();i++){
            listAllCheckState.add(0);
        }
        int Row = listDeviceCodesBean.size()/2;
        jPanelDeviceTypeContainer.setLayout(new GridLayout(Row, 2,1,1));
        for (int i=0;i<listDeviceCodesBean.size();i++){
             CodesBean codesBean = listDeviceCodesBean.get(i);
             boolean Selected = false;
             
             if (codesBean.getRemarks().equals("1")){Selected = true;}
             final JCheckBox jCheckBox = new JCheckBox(codesBean.getCodename(),Selected);
             jCheckBox.setFont(new java.awt.Font("微软雅黑", 0, 16)); // NOI18N
             jCheckBox.setName(Integer.toString(i));
             if (Selected) {
                jCheckBox.setEnabled(false);
             }
                 
            jCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    if (jCheckBox.isSelected()) 
                        listAllCheckState.set(Integer.parseInt(jCheckBox.getName()), 1);
                    else
                        listAllCheckState.set(Integer.parseInt(jCheckBox.getName()), 0);
                }
            });
             jPanelDeviceTypeContainer.add(jCheckBox);
        }
        jPanelContainer.setUI(new PanelUI_MatteBorder());
        jPanelDeviceTypeContainer.setUI(new PanelUI_LineBorder());
        CommonParas.setJButtonUnDecorated(jButtonExit);
    }
    
    public int getState(){
        return iState;
    }
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
            java.util.logging.Logger.getLogger(JDialogDeviceType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogDeviceType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogDeviceType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogDeviceType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JDialogDeviceType dialog = new JDialogDeviceType(new javax.swing.JFrame(), true);
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
        sTitle = Locales.getString("JInFrameDeviceManage", "JDialogDeviceType.sTitle");  //添加设备类型
        jButtonOk.setText(Locales.getString("JInFrameDeviceManage", "JInFrameDeviceManage.jButtonOk"));  //确定
        jButtonCancel.setText(Locales.getString("JInFrameDeviceManage", "JInFrameDeviceManage.jButtonCancel"));  //取消
        jLabelSelectDevType.setText(Locales.getString("JInFrameDeviceManage", "JDialogDeviceType.jLabelSelectDevType"));  //选择要添加的设备类型：

        jLabelTitle.setText(sTitle);  //添加设备类型

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabelSelectDevType;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelContainer;
    private javax.swing.JPanel jPanelDeviceTypeContainer;
    private javax.swing.JPanel jPanelFirst;
    private javax.swing.JPanel jPanelLast;
    private javax.swing.JPanel jPanelNorth;
    // End of variables declaration//GEN-END:variables

    private String sTitle = "添加设备类型";
    
    /**
     * @return the listDeviceCodeName
     */
    public ArrayList<String> getListDeviceCodeName() {
        return listDeviceCodeName;
    }
}
