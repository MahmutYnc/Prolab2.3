/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mahmut
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        connectDatabase();
        showTed();
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        tedEkleButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tedTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        idpane = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        fnamepane = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        countrypane = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        citypane = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        productpane = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        quantitypane = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        datepane = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        lifepane = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        pricepane = new javax.swing.JTextPane();
        tGuncelButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        jScrollPane5.setViewportView(jTextPane4);

        jScrollPane8.setViewportView(jTextPane7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tedEkleButton.setText("Tedarikçi Ekle");
        tedEkleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tedEkleButtonActionPerformed(evt);
            }
        });

        tedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Firma Adi", "Ülke", "Şehir", "Madde", "Miktar", "Üretim Tarihi", "Raf Ömrü", "SatişFiyati"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tedTable);

        jLabel1.setText("ID");

        jLabel2.setText("Şirket Adı");

        jLabel3.setText("Ülke");

        jLabel4.setText("Şehir");

        jLabel5.setText("Madde");

        jLabel6.setText("Miktar");

        jLabel7.setText("Üretim Tarihi");

        jLabel8.setText("Raf Ömrü");

        jLabel9.setText("Satış Fiyatı");

        jScrollPane1.setViewportView(idpane);

        jScrollPane4.setViewportView(fnamepane);

        jScrollPane6.setViewportView(countrypane);

        jScrollPane7.setViewportView(citypane);

        jScrollPane9.setViewportView(productpane);

        jScrollPane10.setViewportView(quantitypane);

        jScrollPane11.setViewportView(datepane);

        jScrollPane12.setViewportView(lifepane);

        jScrollPane13.setViewportView(pricepane);

        tGuncelButton.setText("Güncelle");
        tGuncelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tGuncelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tedEkleButton)
                    .addComponent(tGuncelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(tedEkleButton)
                        .addGap(36, 36, 36)
                        .addComponent(tGuncelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tedarikçi", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Üretici/Satici", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Müşteri", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tGuncelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tGuncelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tGuncelButtonActionPerformed

    private void tedEkleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tedEkleButtonActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/prolab?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey",
                    "root", "");
            String insertquery = "insert into supplier(ID, Companyname, Country, City, Products, Quantity, Productiondate, Shelflife, Saleprice) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(insertquery);
            int tempInt = Integer.parseInt(idpane.getText());
            pst.setInt(1, tempInt);
            pst.setString(2, fnamepane.getText());
            pst.setString(3, countrypane.getText());
            pst.setString(4, citypane.getText());
            pst.setString(5, productpane.getText());
            tempInt = Integer.parseInt(quantitypane.getText());
            pst.setInt(6, tempInt);
            pst.setString(7, datepane.getText());
            tempInt = Integer.parseInt(lifepane.getText());
            pst.setInt(8, tempInt);
            tempInt = Integer.parseInt(pricepane.getText());
            pst.setInt(9, tempInt);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted successfully");
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_tedEkleButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                
            }
        });
    }
     public ArrayList<Ted> tedList() {
        ArrayList<Ted> tedList = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/prolab?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey",
                    "root", "");
            String query1 = "Select * From supplier";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(query1);
            Ted ted;
            //"ID  -CName  -Contry  -Product  -Quantity  -PDate  -ShelfLife  -SaleP"
            while (rs.next()) {
                ted = new Ted(rs.getInt("ID"), rs.getString("Companyname"), rs.getString("Country"),
                        rs.getString("City"), rs.getString("Products"), rs.getInt("Quantity"),
                        rs.getString("Productiondate"), rs.getInt("Shelflife"), rs.getInt("Saleprice"));
                tedList.add(ted);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return tedList;
    }
    public void showTed() {
        

        ArrayList<Ted> tedList = tedList();
        DefaultTableModel tableModel = (DefaultTableModel) tedTable.getModel();
                /*new DefaultTableModel(new String[]{"ID", "FirmaAdi", "Ulke", "Madde", "Miktar",
                "Uretim Tarihi", "Raf Ömrü", "SatisFiyati"}, 0);*/
        Object[] row = new Object[9];
        //"ID  -CName  -Contry  -Product  -Quantity  -PDate  -ShelfLife  -SaleP"
        for (int i = 0; i < tedList.size(); i++) {
            row[0] = tedList.get(i).getId();
            row[1] = tedList.get(i).getFirmaAdi();
            row[2] = tedList.get(i).getUlke();
            row[3] = tedList.get(i).getSehir();
            row[4] = tedList.get(i).getMadde();
            row[5] = tedList.get(i).getMiktar();
            row[6] = tedList.get(i).getuTarihi();
            row[7] = tedList.get(i).getRaf();
            row[8] = tedList.get(i).getSatisFiyati();
            tableModel.addRow(row);
            System.out.println(tedList.get(i).getSehir());
        }
        /*
        tedTable.setModel(tableModel);
        tedTable.setFillsViewportHeight(true);
        tedTable.setPreferredScrollableViewportSize(new Dimension(670, 80));
        tedTable.setFillsViewportHeight(true);*/

    }


      public void connectDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/prolab?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from supplier");
            System.out.println("ID  -CName  -Contry  -City  -Product  -Quantity  -PDate  -ShelfLife  -SaleP");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " +
                        rs.getString(4) + " | " + rs.getString(5) + " | " +
                        rs.getInt(6) + " | " + rs.getString(7) + " | " +
                        rs.getInt(8) + " | " + rs.getInt(9));
            }
            rs = stmt.executeQuery("select * from manufacturer");
            while(rs.next()){
                System.out.println();
            }
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane citypane;
    private javax.swing.JTextPane countrypane;
    private javax.swing.JTextPane datepane;
    private javax.swing.JTextPane fnamepane;
    private javax.swing.JTextPane idpane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane lifepane;
    private javax.swing.JTextPane pricepane;
    private javax.swing.JTextPane productpane;
    private javax.swing.JTextPane quantitypane;
    private javax.swing.JButton tGuncelButton;
    private javax.swing.JButton tedEkleButton;
    private javax.swing.JTable tedTable;
    // End of variables declaration//GEN-END:variables
}
class Ted {
    private int id, miktar, raf, satisFiyati;
    private String firmaAdi, ulke, sehir, uTarihi, madde;

    //"ID  -CName  -Contry  -Product  -Quantity  -PDate  -ShelfLife  -SaleP"
    public Ted(int id, String firmaAdi, String ulke, String sehir, String madde,
               int miktar, String uTarihi, int raf, int satisFiyati) {
        this.id = id;
        this.miktar = miktar;
        this.raf = raf;
        this.satisFiyati = satisFiyati;
        this.firmaAdi = firmaAdi;
        this.ulke = ulke;
        this.sehir = sehir;
        this.uTarihi = uTarihi;
        this.madde = madde;
    }

    public String getMadde() {
        return madde;
    }

    public int getId() {
        return id;
    }

    public int getMiktar() {
        return miktar;
    }

    public int getRaf() {
        return raf;
    }

    public int getSatisFiyati() {
        return satisFiyati;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public String getUlke() {
        return ulke;
    }

    public String getSehir() {
        return sehir;
    }

    public String getuTarihi() {
        return uTarihi;
    }
}

