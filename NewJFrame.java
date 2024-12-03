/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classmain;

/**
 *
 * @author ivan ruel baliton
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        txt_supplyID = new javax.swing.JTextField();
        lbl_supplyID = new javax.swing.JLabel();
        lbl_supplyname = new javax.swing.JLabel();
        txt_supplyname = new javax.swing.JTextField();
        lbl_supplydescription = new javax.swing.JLabel();
        txt_supplydescription = new javax.swing.JTextField();
        lbl_itemprice = new javax.swing.JLabel();
        txt_itemprice = new javax.swing.JTextField();
        lbl_dateofpurchase = new javax.swing.JLabel();
        txt_dateofpurchase = new javax.swing.JTextField();
        btn_output = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_output = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_supplyID.setText("Supply ID");

        lbl_supplyname.setText("Supply Name");

        lbl_supplydescription.setText("Supply Description");

        lbl_itemprice.setText("Item Price");

        lbl_dateofpurchase.setText("Date of Purchase");

        btn_output.setText("Display");
        btn_output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_outputActionPerformed(evt);
            }
        });

        txt_output.setColumns(20);
        txt_output.setRows(5);
        jScrollPane1.setViewportView(txt_output);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_dateofpurchase)
                    .addComponent(lbl_itemprice)
                    .addComponent(lbl_supplydescription)
                    .addComponent(lbl_supplyname)
                    .addComponent(lbl_supplyID)
                    .addComponent(txt_supplyID)
                    .addComponent(txt_supplyname)
                    .addComponent(txt_supplydescription)
                    .addComponent(txt_itemprice)
                    .addComponent(txt_dateofpurchase, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_output, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_supplyID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_supplyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lbl_supplyname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_supplyname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_supplydescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_supplydescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_itemprice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_itemprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_dateofpurchase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dateofpurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_output))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_outputActionPerformed
        
        String datepurchase = txt_dateofpurchase.getText();
        int supplyID = Integer.parseInt(txt_supplyID.getText());
        String supplyName = txt_supplyname.getText();
        String supplyDescription = txt_supplydescription.getText();
        double itemPrice = Integer.parseInt(txt_itemprice.getText());
        double currentPrice = Integer.parseInt(txt_itemprice.getText());
        String purchaseDate = txt_dateofpurchase.getText();
        
        
        
        Supply supp = new Supply(supplyID,supplyName,supplyDescription,itemPrice,purchaseDate);
        PriceHike pricehike = new PriceHike();
        supp.stockDuration(datepurchase);
        pricehike.setCurrentPrice(currentPrice);
        pricehike.priceComputed(supp.years);
        
        
        
        
        txt_output.setText("Supply ID: " + supp.getSupplyID() + 
                           "\nSupply Name: " + supp.getSupplyName() + 
                           "\nSupply Description: " + supp.getSupplyDescription() + 
                           "\nItem Price: " + supp.getItemPrice() + 
                           "\nPurchase Date: " + supp.getPurchaseDate() + 
                           "\nNo. of months in stock: " + supp.totalmonths + 
                           "\nNo. of years in stock: " + supp.years + 
                           "\nNo. of years with months in stock: " + supp.years + " years and " + supp.months + " months" + 
                           "\nUpdated Price: " + pricehike.getUpdatedPrice()) ;
        
    }//GEN-LAST:event_btn_outputActionPerformed

   
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_output;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_dateofpurchase;
    private javax.swing.JLabel lbl_itemprice;
    private javax.swing.JLabel lbl_supplyID;
    private javax.swing.JLabel lbl_supplydescription;
    private javax.swing.JLabel lbl_supplyname;
    private javax.swing.JTextField txt_dateofpurchase;
    private javax.swing.JTextField txt_itemprice;
    private javax.swing.JTextArea txt_output;
    private javax.swing.JTextField txt_supplyID;
    private javax.swing.JTextField txt_supplydescription;
    private javax.swing.JTextField txt_supplyname;
    // End of variables declaration//GEN-END:variables
}
