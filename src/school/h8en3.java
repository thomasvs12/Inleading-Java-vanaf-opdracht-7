package school;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h8en3 extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextField tekstvak;
    Label label;				
    double getal;
    double btw;
	
    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type hier een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        btw=1.21;
    }

    public void paint(Graphics g) {
        g.drawString("Het getal is " + getal * btw, 50, 60 );
        setSize(500,2500);
    }
	
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
           
            repaint();
        }
    }
}


