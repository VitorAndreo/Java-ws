package trabalhoPratico_Etapa1;

import java.awt.*;
import javax.swing.*;


class Tela extends JPanel {
	private void Desenhar(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(Color.GRAY);
		g2d.fillRect(20, 10, 580, 400);

		g2d.setColor(Color.BLACK);
		g2d.fillRect(200, 190, 200, 200);

		g2d.setColor(Color.RED);
		int [] x = {300, 400, 200};
        int [] y = {50, 190, 190};
		g2d.fillPolygon(x, y, 3);

		g2d.setColor(Color.BLUE);
		g2d.fillRect(220, 240, 80, 140);

		g2d.setColor(Color.GREEN);
		g2d.fillRect(310, 300, 70, 50);
		
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Desenhar(g);
	}
}