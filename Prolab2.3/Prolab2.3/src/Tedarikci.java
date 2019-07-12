import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

@SuppressWarnings("Duplicates")
public class Tedarikci extends JPanel {
    JTable table;

    public JButton t = new JButton("Tedarikci Ekle");
    JFrame frame = new JFrame("Tedarikçi Ekle");
    JLabel heading = new JLabel("~~~~~~~~Tedarikci bilgilerini giriniz~~~~~~~~");
    JLabel firmaID = new JLabel("Firma ID: ");
    JLabel firmaAdı = new JLabel("Firma adini giriniz:   ");
    JLabel ulke = new JLabel("Ülkeyi giriniz: ");
    JLabel sehir = new JLabel("Sehiri giriniz: ");
    JLabel madde = new JLabel("Madde türünü giriniz: ");
    JLabel miktar = new JLabel("Miktar giriniz: ");
    JLabel uTarihi = new JLabel("Üretim tarihini giriniz: ");
    JLabel rafOmru = new JLabel("Rafömrünü giriniz: ");
    JLabel satisF = new JLabel("Satisfiyatını giriniz: ");

    JTextField id = new JTextField(7);
    JTextField ad = new JTextField(7);
    JTextField ulk = new JTextField(7);
    JTextField seh = new JTextField(7);
    JTextField mad = new JTextField(7);
    JTextField mik = new JTextField(7);
    JTextField uth = new JTextField(7);
    JTextField raf = new JTextField(7);
    JTextField sat = new JTextField(7);


    JButton ekle = new JButton("Tedarikçiyi Ekle");

    JPanel head = new JPanel();
    JPanel fID = new JPanel();
    JPanel fad = new JPanel();
    JPanel ulkem = new JPanel();
    JPanel sehrim = new JPanel();
    JPanel maddem = new JPanel();
    JPanel miktarim = new JPanel();
    JPanel tarihim = new JPanel();
    JPanel omrum = new JPanel();
    JPanel fiyatim = new JPanel();

    String[] textFields = new String[9];

    public Tedarikci() {

        setLayout(new FlowLayout());

        connectDatabase();
        showTed();

        tedEkle();
        this.add(t);

    }

    public void connectDatabase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/prolab?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from supplier");
            System.out.println("ID  -CName  -Contry  -Product  -Quantity  -PDate  -ShelfLife  -SaleP");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " +
                        rs.getString(4) + " | " + rs.getInt(5) + " | " + rs.getString(6) + " | " +
                        rs.getInt(7) + " | " + rs.getInt(8));
            }
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void tedEkle() {

        t.setSize(100, 30);
        t.setLocation(500, 600);
        t.setVisible(true);
        t.addActionListener(actionEvent -> {
            frame.setLayout(new FlowLayout());
            frame.setSize(300, 450);
            frame.setResizable(false);


            head.add(heading);
            frame.add(head);

            fID.add(firmaID);
            fID.add(id);
            frame.add(fID);

            fad.add(firmaAdı);
            fad.add(ad);
            frame.add(fad);

            ulkem.add(ulke);
            ulkem.add(ulk);
            frame.add(ulkem);

            sehrim.add(sehir);
            sehrim.add(seh);
            frame.add(sehrim);

            maddem.add(madde);
            maddem.add(mad);
            frame.add(maddem);

            miktarim.add(miktar);
            miktarim.add(mik);
            frame.add(miktarim);

            tarihim.add(uTarihi);
            tarihim.add(uth);
            frame.add(tarihim);

            omrum.add(rafOmru);
            omrum.add(raf);
            frame.add(omrum);

            fiyatim.add(satisF);
            fiyatim.add(sat);
            frame.add(fiyatim);

            frame.add(ekle, BorderLayout.SOUTH);
            ekle.addActionListener(e -> {

                textFields[0] = id.getText();
                textFields[1] = ad.getText();
                textFields[2] = ulk.getText();
                textFields[3] = seh.getText();
                textFields[4] = mad.getText();
                textFields[5] = mik.getText();
                textFields[6] = uth.getText();
                textFields[7] = raf.getText();
                textFields[8] = sat.getText();

                for (int i = 0; i < 9; i++) {
                    System.out.println(textFields[i]);
                }
                resetTextFields();
            });


            frame.setLayout(new FlowLayout(FlowLayout.CENTER));

            frame.setVisible(true);
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
                        rs.getString("Products"), rs.getInt("Quantity"), rs.getString("Productiondate"),
                        rs.getInt("Shelflife"), rs.getInt("Saleprice"));
                tedList.add(ted);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return tedList;
    }

    public void showTed() {
        table = new JTable();

        ArrayList<Ted> tedList = tedList();
        DefaultTableModel tableModel = new DefaultTableModel(new String[]{"ID", "FirmaAdi", "Ulke", "Madde", "Miktar",
                "Uretim Tarihi", "Raf Ömrü", "SatisFiyati"}, 0);
        Object[] row = new Object[8];
        //"ID  -CName  -Contry  -Product  -Quantity  -PDate  -ShelfLife  -SaleP"
        for (int i = 0; i < tedList.size(); i++) {
            row[0] = tedList.get(i).getId();
            row[1] = tedList.get(i).getFirmaAdi();
            row[2] = tedList.get(i).getUlke();
            row[3] = tedList.get(i).getMadde();
            row[4] = tedList.get(i).getMiktar();
            row[5] = tedList.get(i).getuTarihi();
            row[6] = tedList.get(i).getRaf();
            row[7] = tedList.get(i).getSatisFiyati();
            tableModel.addRow(row);
        }

        table.setModel(tableModel);
        table.setFillsViewportHeight(true);
        table.setPreferredScrollableViewportSize(new Dimension(670, 80));
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane, BorderLayout.CENTER);

    }

    public void resetTextFields() {
        id.setText("");
        ad.setText("");
        ulk.setText("");
        seh.setText("");
        mad.setText("");
        mik.setText("");
        uth.setText("");
        raf.setText("");
        sat.setText("");
    }
    public Connection getConnection()
    {
        Connection con;
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/prolab?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey",
                    "root", "");
            return con;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public void executeSQlQuery(String query, String message)
    {
        Connection con = getConnection();
        Statement st;
        try{
            st = con.createStatement();
            if((st.executeUpdate(query)) == 1)
            {
                // refresh jtable data
                DefaultTableModel model = (DefaultTableModel)table.getModel();
                model.setRowCount(0);
                showTed();

                JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
            }else{
                JOptionPane.showMessageDialog(null, "Data Not "+message);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}


class Ted {
    private int id, miktar, raf, satisFiyati;
    private String firmaAdi, ulke, sehir, uTarihi, madde;

    //"ID  -CName  -Contry  -Product  -Quantity  -PDate  -ShelfLife  -SaleP"
    public Ted(int id, String firmaAdi, String ulke, String madde,
               int miktar, String uTarihi, int raf, int satisFiyati) {
        this.id = id;
        this.miktar = miktar;
        this.raf = raf;
        this.satisFiyati = satisFiyati;
        this.firmaAdi = firmaAdi;
        this.ulke = ulke;
        //this.sehir = sehir;
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

    /*public String getSehir() {
        return sehir;
    }*/

    public String getuTarihi() {
        return uTarihi;
    }
}
