import javax.swing.*;
import java.awt.*;

public class MainFrame {
    JFrame frame = new JFrame("Prolab.2 - 3");
    int WIDTH = 800, HEIGHT = 800;
    Dimension dimension = new Dimension(WIDTH, HEIGHT);
    public void frame(){
        frame.setLayout(new BorderLayout());
        frame.setSize(dimension);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JTabbedPane tabbedPane = new JTabbedPane();

        Tedarikci tedarikci = new Tedarikci();
        tabbedPane.add("tedarikci", tedarikci);

        JPanel uretici = new JPanel();
        tabbedPane.add("Üretici", uretici);
        JPanel musteri = new JPanel();
        tabbedPane.add("Müşteri", musteri);

        frame.setLocationRelativeTo(null);
        frame.setLocation(80,10);
        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
