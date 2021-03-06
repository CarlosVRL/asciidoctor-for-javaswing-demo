package codinginfire;

import javax.swing.*;

/**
 * An AsciidocSwingDemo Panel.
 */
public class AsciidocSwingDemo extends javax.swing.JFrame {

    private final AsciidocSwingDemoCtrl ctrl;

    /**
     * Creates new form AsciidocSwingDemo
     */
    public AsciidocSwingDemo(AsciidocSwingDemoCtrl ctrl) {
        initComponents();
        this.ctrl = ctrl;
        initCtrl();
    }

    private void initCtrl() {
        ctrl.setNameFetcher(new StringFetcher() {
            @Override
            public String fetch() {
                return nameTxt.getText();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        sayHelloBtn = new javax.swing.JButton();
        showHelpBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLbl.setText("Name:");

        sayHelloBtn.setText("Say Hello");
        sayHelloBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sayHelloBtnActionPerformed(evt);
            }
        });

        showHelpBtn.setText("Show Help");
        showHelpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHelpBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(nameLbl)
                        .addGap(18, 18, 18)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(showHelpBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sayHelloBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {sayHelloBtn, showHelpBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sayHelloBtn)
                    .addComponent(showHelpBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sayHelloBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sayHelloBtnActionPerformed
        JOptionPane.showMessageDialog(this, ctrl.sayHello());
    }//GEN-LAST:event_sayHelloBtnActionPerformed

    private void showHelpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHelpBtnActionPerformed
        ctrl.showHelp();
    }//GEN-LAST:event_showHelpBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton sayHelloBtn;
    private javax.swing.JButton showHelpBtn;
    // End of variables declaration//GEN-END:variables
}
