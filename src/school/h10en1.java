package school;
import java.applet.*;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class h10en1 extends Applet {

	TextField tf;
	Button b;
	long hoogsteGetal;
	
	public void init() {
		tf = new TextField("", 5);
		add(tf);
		b = new Button("Voer in");
		b.addActionListener(new KnopLuisteraar());
		add(b);
		hoogsteGetal = 0;
		
	}
	
	public void paint(Graphics g) {
		g.drawString("Hoogste getal: " + hoogsteGetal, 50, 70);
		
	}
	
	class KnopLuisteraar implements  ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			String s = tf.getText();
			long l = Long.parseLong(s);
			if (l > hoogsteGetal) {
				hoogsteGetal = l;	
			}
			repaint ();
		}
	}
}

