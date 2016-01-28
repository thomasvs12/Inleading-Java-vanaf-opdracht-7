package school;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class h8en1 extends Applet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button knop;
	Button knop2;
    String schermtekst;
    TextField tekstvak;
    String s;
	
    public void init() {
    	tekstvak = new TextField("",20);
        schermtekst = ("Doet deze knop wel iets?");
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        knop2 = new Button("Reset");
        KnopListener1 kl1 = new KnopListener1();
        knop2.addActionListener( kl1 );
        add(tekstvak);
        add(knop);
        add(knop2);
        s = "";
    }

    public void paint(Graphics g) {
        setSize(500,2500);
        g.drawString(s, 50, 60 );
    
    }

	
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	 s = tekstvak.getText();
            repaint();
        }
    }
        class KnopListener1 implements ActionListener {
            public void actionPerformed( ActionEvent e ) {
            	s = ("");
            	tekstvak.setText("");
                repaint();
    }
}
    }

