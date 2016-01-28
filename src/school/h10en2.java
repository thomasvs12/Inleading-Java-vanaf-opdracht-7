package school;
import java.applet.*;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class h10en2 extends Applet {

	TextField tf;
	Button b;
	long hoogsteGetal;
	long laagsteGetal;
	long random;
	
	public void init() {
		tf = new TextField("", 5);
		add(tf);
		b = new Button("Voer in");
		b.addActionListener(new KnopLuisteraar());
		add(b);
		
	}
	
	public void paint(Graphics g) {
		g.drawString("Hoogste getal: " + hoogsteGetal, 50, 70);
		g.drawString("Laagste getal:  " + laagsteGetal, 50, 90);
	}
	
	class KnopLuisteraar implements  ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			random = Long.parseLong(tf.getText());
			if (laagsteGetal == 0)
			{
				laagsteGetal = random;
			}
			if (random > hoogsteGetal){
				hoogsteGetal = random;
				tf.setText(null);
			}
			if (random < laagsteGetal){
				laagsteGetal = random;
			}
			tf.setText (null);
			repaint();
			}
		}
	}

