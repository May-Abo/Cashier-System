package CashierSystem;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class CashierInterface extends javax.swing.JFrame {

    static List<Items> shopingList = new ArrayList();

    public CashierInterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        exitButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Adobe Devanagari", 1, 36)); // NOI18N
        setForeground(new java.awt.Color(204, 0, 0));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        Vector <String> itemsNames = new Vector<>();
        for (int i = 0; i < shopingList.size(); i++) {
            itemsNames.add(shopingList.get(i).getName());
        }
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(itemsNames));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantity per item:");

        /*
        */
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Store Receipt");

        jLabel3.setText("Item Name");

        jLabel4.setText("Item Type");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Checkout");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Add another item");

        exitButton.setText("Submit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox2, 0, 115, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        Vector<String> itemsvarieties = new Vector<>();

        if (jComboBox1.getSelectedItem().equals("Adult Shoes")) {
            for (int y = 0; y < shopingList.get(0).getVariants().size(); y++) {
                itemsvarieties.add(shopingList.get(0).getVariants().get(y).getSize());
            }
        } else if (jComboBox1.getSelectedItem().equals("Child Shoes")) {
            for (int y = 0; y < shopingList.get(1).getVariants().size(); y++) {
                itemsvarieties.add(shopingList.get(1).getVariants().get(y).getSize());
            }
        } else if (jComboBox1.getSelectedItem().equals("Eggs")) {
            for (int y = 0; y < shopingList.get(2).getVariants().size(); y++) {
                itemsvarieties.add(shopingList.get(2).getVariants().get(y).getSize());
            }
        } else if (jComboBox1.getSelectedItem().equals("Apples")) {
            for (int y = 0; y < shopingList.get(3).getVariants().size(); y++) {
                itemsvarieties.add(shopingList.get(3).getVariants().get(y).getSize());
            }
        } else if (jComboBox1.getSelectedItem().equals("Prepared Sandwich")) {
            for (int y = 0; y < shopingList.get(4).getVariants().size(); y++) {
                itemsvarieties.add(shopingList.get(4).getVariants().get(y).getSize());
            }
        } else if (jComboBox1.getSelectedItem().equals("Book")) {
            for (int y = 0; y < shopingList.get(5).getVariants().size(); y++) {
                itemsvarieties.add(shopingList.get(5).getVariants().get(y).getSize());
            }
        } else if (jComboBox1.getSelectedItem().equals("Toy")) {
            for (int y = 0; y < shopingList.get(6).getVariants().size(); y++) {
                itemsvarieties.add(shopingList.get(6).getVariants().get(y).getSize());
            }
        }
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(itemsvarieties));
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        variant = jComboBox2.getSelectedIndex();

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

        try {
            jLabel5.setText("");
            String quantity = jTextField1.getText();

            for (int y = 0; y < 7; y++) {

                if (jComboBox1.getSelectedItem().equals(shopingList.get(y).getName())) {
                    subtotal += shopingList.get(y).getVariants().get(variant).getPrice() * Integer.parseInt(quantity);
                    tax = (shopingList.get(y).getVariants().get(variant).getRate() * shopingList.get(y).getVariants().get(variant).getPrice()) * Integer.parseInt(quantity);
                    totalTax += tax;
                    receipt.add(new Receipt(subtotal, tax, Integer.parseInt(quantity), variant, shopingList.get(y)));
                    System.out.format("%-10s%-35s%-4s%-6s%-10s", Integer.parseInt(quantity), jComboBox1.getSelectedItem()
                            + " - " + jComboBox2.getSelectedItem(), "",
                            shopingList.get(y).getVariants().get(jComboBox2.getSelectedIndex()).getTax_code(),
                            new DecimalFormat("###.##").format(shopingList.get(y).getVariants().get(jComboBox2.getSelectedIndex()).getPrice() * Integer.parseInt(quantity)));
                    System.out.println();
                    break;
                }
            }
            total = subtotal + totalTax;

            Map<Integer, Double> taxRepetitions = new HashMap<>();
            double x0 = 0;
            double x1 = 0;
            double x3 = 0;
            double x4 = 0;
            double x5 = 0;
            double x7 = 0;
            for (int i = 0; i < receipt.size(); i++) {

                switch (receipt.get(i).getItem().getVariants().get(receipt.get(i).getSizeType()).getTax_code()) {
                    case 0:
                        taxRepetitions.put(0, x0 += receipt.get(i).getTotalTax());
                        break;
                    case 1:
                        taxRepetitions.put(1, x1 += receipt.get(i).getTotalTax());
                        break;
                    case 3:
                        taxRepetitions.put(3, x3 += receipt.get(i).getTotalTax());
                        break;
                    case 4:
                        taxRepetitions.put(4, x4 += receipt.get(i).getTotalTax());
                        break;
                    case 5:
                        taxRepetitions.put(5, x5 += receipt.get(i).getTotalTax());
                        break;
                    case 7:
                        taxRepetitions.put(7, x7 += receipt.get(i).getTotalTax());
                        break;
                }
            }
            DecimalFormat df = new DecimalFormat("#%");

            if (jRadioButton1.isSelected() == true) {
                System.out.format("%30s%10s", "SUBTOTLA:", ("$" + new DecimalFormat("###.##").format(subtotal)));
                System.out.println();
                for (Map.Entry<Integer, Double> entry : taxRepetitions.entrySet()) {
                    System.out.format("%-40s%-9s%-6s%-10s", (entry.getKey() + "-"
                            + new Variants(entry.getKey()).getTaxName()),
                            " ", df.format(new Variants(entry.getKey()).getRate()),
                            new DecimalFormat("###.##").format(entry.getValue()));
                    System.out.println();
                }
                System.out.format("%30s%10s", "TOTAL:   ", ("$" + new DecimalFormat("###.##").format(total)));
                System.out.println();
                System.exit(0);
                new CashierInterface().setDefaultCloseOperation(CashierInterface.DISPOSE_ON_CLOSE);
            }

        } catch (NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            jLabel5.setText("Please enter the correct data");
        } finally {
            buttonGroup1.clearSelection();
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedItem(null);
            jTextField1.setText("");
        }


    }//GEN-LAST:event_exitButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CashierInterface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierInterface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierInterface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierInterface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierInterface().setVisible(true);
            }
        });

        System.out.println("=============================================================");
        System.out.format("%40s", "Cashier System");
        System.out.println();
        System.out.println("============================================================= ");
        System.out.format("%-15s%-30s%-10s%-10s", "Quantity", "Description", "Tax Code", "Amount");
        System.out.println();

        List<Variants> adultShoes = new ArrayList();
        adultShoes.add(new Variants("Size 6 ", 39.99, 0));
        adultShoes.add(new Variants("Size 8 ", 39.99, 0));
        adultShoes.add(new Variants("Size 10 ", 39.99, 0));
        shopingList.add(new Items(1000, "Adult Shoes", adultShoes));

        List<Variants> childShoes = new ArrayList();
        childShoes.add(new Variants("Size 1 ", 19.99, 3));
        childShoes.add(new Variants("Size 4 ", 19.99, 3));
        childShoes.add(new Variants("Size 7 ", 19.99, 0));
        shopingList.add(new Items(2000, "Child Shoes", childShoes));

        List<Variants> eggs = new ArrayList();
        eggs.add(new Variants("Size 6 ", 1.5, 7));
        eggs.add(new Variants("Size 12 ", 2.25, 7));
        shopingList.add(new Items(3000, "Eggs", eggs));

        List<Variants> apples = new ArrayList();
        apples.add(new Variants("Size 1 ", 0.30, 7));
        apples.add(new Variants("Size 10 ", 2.50, 7));
        shopingList.add(new Items(3100, "Apples", apples));

        List<Variants> preparedsandwich = new ArrayList();
        preparedsandwich.add(new Variants("Size Small ", 2.50, 5));
        preparedsandwich.add(new Variants("Size Large ", 4.00, 5));
        shopingList.add(new Items(4000, "Prepared Sandwich", preparedsandwich));

        List<Variants> book = new ArrayList();
        book.add(new Variants("Assorted ", 11.00, 1));
        shopingList.add(new Items(5423, "Book", book));

        List<Variants> toy = new ArrayList();
        toy.add(new Variants("Various ", 3.99, 0));
        shopingList.add(new Items(9999, "Toy", toy));

    }

    private int variant;
    private static double subtotal;
    private double tax;
    private double totalTax;
    private double total;
    private List<Receipt> receipt = new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exitButton;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
