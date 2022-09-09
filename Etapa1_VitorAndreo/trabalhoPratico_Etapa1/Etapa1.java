package trabalhoPratico_Etapa1;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Etapa1 {    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Painel pn = new Painel();
                pn.setVisible(true);
            }
        });
    }
}