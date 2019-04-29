import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends Canvas {
    private JFrame loginFrame;
    JButton supplier = new JButton("Tedarikçi");
    JButton manufacturer = new JButton("Üretici/Satıcı");
    JButton buyer = new JButton("Müşteri");

    ImageIcon merc = new ImageIcon("merchant.jpg");
    ImageIcon buy = new ImageIcon("buyer.jpg");
    ImageIcon mine = new ImageIcon("miner.jpg");

    int menuWidth = 100; //Width of each button/item on display
    int menuHeight = 30;//Height of each button/item on display
    int menuY = 460; //Button/item location on display
    int WIDTH = 654;
    int HEIGHT = 640;

    Dimension dimension = new Dimension(WIDTH, HEIGHT);

    public void createScreen() {
        loginFrame = new JFrame("Login Screen");
        loginFrame.setResizable(false);
        loginFrame.setSize(dimension);
        loginFrame.setLayout(null);
        loginFrame.setLocation(200,100);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Supplier button addded
        supplier.setSize(menuWidth, menuHeight);
        supplier.setLocation(70,menuY);
        loginFrame.add(supplier);
        supplier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        //Manufacturer button added below here
        manufacturer.setSize(menuWidth, menuHeight);
        manufacturer.setLocation(270, menuY);
        loginFrame.add(manufacturer);
        manufacturer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        //Buyer button
        buyer.setSize(menuWidth,menuHeight);
        buyer.setLocation(470,menuY);
        loginFrame.add(buyer);
        buyer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        loginFrame.setVisible(true);
    }

}
