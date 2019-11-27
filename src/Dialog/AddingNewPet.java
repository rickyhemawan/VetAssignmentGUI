/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dialog;

import Model.Cat;
import Model.Dog;
import Model.Pet;
import Utils.GlobalFunction;
import javax.swing.JOptionPane;

/**
 *
 * @author ricky
 */
public class AddingNewPet extends javax.swing.JDialog {

    private Pet addAPet;
    

    public Pet getAddAPet() {
        return addAPet;
    }

    public void setAddAPet(Pet addAPet) {
        this.addAPet = addAPet;
    }
    
    public void typeHider(){
        if(rbtn_typeDog.isSelected()){
            lbl_Allergic.setVisible(false);
            rbtn_allergicFalse.setVisible(false);
            rbtn_allergicTrue.setVisible(false);
            tf_breed.setVisible(true);
            lbl_breed.setVisible(true);
        }
        else{
            lbl_Allergic.setVisible(true);
            rbtn_allergicFalse.setVisible(true);
            rbtn_allergicTrue.setVisible(true);
            tf_breed.setVisible(false);
            lbl_breed.setVisible(false);
        }
    }

    public void reclear(){
        tf_bornDay.setText("");
        tf_breed.setText("");
        tf_month.setText("");
        tf_name.setText("");
        tf_weight.setText("");
        tf_year.setText("");
        rbtn_allergicFalse.setSelected(true);
        rbtn_allergicTrue.setSelected(false);
    }
    /**
     * Creates new form AddingNewPet
     */
    public AddingNewPet(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        rbtn_typeDog.setSelected(true);
        typeHider();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        btn_confirm = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_weight = new javax.swing.JTextField();
        tf_breed = new javax.swing.JTextField();
        lbl_breed = new javax.swing.JLabel();
        lbl_Allergic = new javax.swing.JLabel();
        rbtn_allergicTrue = new javax.swing.JRadioButton();
        rbtn_allergicFalse = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        tf_bornDay = new javax.swing.JTextField();
        tf_month = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_year = new javax.swing.JTextField();
        lbl_type = new javax.swing.JLabel();
        rbtn_typeDog = new javax.swing.JRadioButton();
        rbtn_typeCat = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btn_confirm.setText("Confirm");
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btn_confirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cancel)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_confirm)
                    .addComponent(btn_clear)
                    .addComponent(btn_cancel))
                .addGap(31, 31, 31))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Pet");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name :");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Weight (Kg) :");

        lbl_breed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_breed.setText("Breed :");

        lbl_Allergic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Allergic.setText("Allergic :");

        rbtn_allergicTrue.setText("Yes");

        rbtn_allergicFalse.setSelected(true);
        rbtn_allergicFalse.setText("No");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Day of Born (ex: 31) :");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Month of Born (ex: 12) :");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Year of Born (ex : 2018) :");

        lbl_type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_type.setText("Pet Type :");

        buttonGroup1.add(rbtn_typeDog);
        rbtn_typeDog.setText("Dog");
        rbtn_typeDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_typeDogActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtn_typeCat);
        rbtn_typeCat.setSelected(true);
        rbtn_typeCat.setText("Cat");
        rbtn_typeCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_typeCatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_name))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_weight))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_year, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_Allergic, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtn_allergicTrue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbtn_allergicFalse))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tf_month))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tf_bornDay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_type, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtn_typeDog)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbtn_typeCat)))
                                .addGap(0, 67, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_breed, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_breed)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_typeDog)
                    .addComponent(lbl_type)
                    .addComponent(rbtn_typeCat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_bornDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_allergicTrue)
                    .addComponent(lbl_Allergic)
                    .addComponent(rbtn_allergicFalse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_breed)
                    .addComponent(tf_breed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
        if(tf_name.getText().isEmpty()
            || tf_weight.getText().trim().isEmpty()
            || tf_bornDay.getText().trim().isEmpty()
            || tf_month.getText().trim().isEmpty()
            || tf_year.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill all the missing field");
        }
        else if(rbtn_typeDog.isSelected() && tf_breed.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill in the Breed");
        }
        else if(tf_bornDay.getText().trim().length() != 2
            || tf_month.getText().trim().length() != 2
            || tf_year.getText().trim().length() != 4){
            JOptionPane.showMessageDialog(this, "Incorrect Date!");
        }else{
            try{
                double updateWeight = Double.parseDouble(tf_weight.getText().trim());
                int updateBornDay = Integer.parseInt(tf_bornDay.getText().trim());
                int updateMonth = Integer.parseInt(tf_month.getText().trim());
                int updateYear= Integer.parseInt(tf_year.getText().trim());
                if(rbtn_typeDog.isSelected()){
                    addAPet = new Dog();
                }
                else{
                    addAPet = new Cat();
                }
                addAPet.setPetID(GlobalFunction.getAssignPetID());
                GlobalFunction.incrementAssignPetID();
                addAPet.setName(tf_name.getText());
                addAPet.setDob(GlobalFunction.strToDate(tf_bornDay.getText().trim(),
                    tf_month.getText().trim(),
                    tf_year.getText().trim()));
                addAPet.setWeight(updateWeight);
                if(addAPet instanceof Dog){
                    ((Dog)addAPet).setBreed(tf_breed.getText());
                }
                else if(addAPet instanceof Cat){
                    if(rbtn_allergicTrue.isSelected()){
                        ((Cat)addAPet).setAllergic(true);
                    }
                    else{
                        ((Cat)addAPet).setAllergic(false);
                    }

                }
                setVisible(false);
                reclear();
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Weight, Day, Month, Year must be number.");
            }
        }

    }//GEN-LAST:event_btn_confirmActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        reclear();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        reclear();
        this.addAPet = null;
        setVisible(false);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void rbtn_typeCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_typeCatActionPerformed
        typeHider();
    }//GEN-LAST:event_rbtn_typeCatActionPerformed

    private void rbtn_typeDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_typeDogActionPerformed
        typeHider();
    }//GEN-LAST:event_rbtn_typeDogActionPerformed

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
            java.util.logging.Logger.getLogger(AddingNewPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddingNewPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddingNewPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddingNewPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddingNewPet dialog = new AddingNewPet(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_confirm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Allergic;
    private javax.swing.JLabel lbl_breed;
    private javax.swing.JLabel lbl_type;
    private javax.swing.JRadioButton rbtn_allergicFalse;
    private javax.swing.JRadioButton rbtn_allergicTrue;
    private javax.swing.JRadioButton rbtn_typeCat;
    private javax.swing.JRadioButton rbtn_typeDog;
    private javax.swing.JTextField tf_bornDay;
    private javax.swing.JTextField tf_breed;
    private javax.swing.JTextField tf_month;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_weight;
    private javax.swing.JTextField tf_year;
    // End of variables declaration//GEN-END:variables
}