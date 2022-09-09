package trabalhoPratico_Etapa1;
import java.awt.*;
import javax.swing.*;

public class Painel extends JFrame {
    JLabel nomePront = new JLabel("Vítor Saraiva Andrêo   SL300323X", JLabel.CENTER);

    public Painel() {
        add(nomePront);
        nomePront.setBounds(70, 395, 200, 50);;
        initUI();
    }
    private void initUI() {
        add(new Tela());
        setTitle("Etapa1");
        setSize(640, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}