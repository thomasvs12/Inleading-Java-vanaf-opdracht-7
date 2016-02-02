package fruitplaatjes;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class toets extends Applet {
	int geld = 10, krediet, random;
	String schermtekst;
	TextField tekstvak;
	String s;
	Button Knop;
	Button Knop2;
	double naam;
	int fruit1;
	int fruit2;
	int fruit3;
	Image[] fruit;

	public void init() {
		setSize(400, 400);
		fruit = new Image[20];
		for (int i = 0; i < fruit.length; i++) {
			fruit[i] = getImage(getCodeBase(), "fruitplaatjes/fruit_" + (i + 1) + ".jpg");
		}
		Knop = new Button("Speel");
		Knop.addActionListener(new SpeelKnopLuisteraar());
		add(Knop);
		Knop2 = new Button("Koop 10 Kredietpunten");
		Knop2.setEnabled(false);
		Knop2.addActionListener(new KredietKnopLuisteraar());
		add(Knop2);
		naam = Math.random();
		random = (int) (naam * 20 + 1);
		fruit1 = (int) (Math.random() * 20);
		fruit2 = (int) (Math.random() * 20);
		fruit3 = (int) (Math.random() * 20);

	}

	public void paint(Graphics g) {
		g.drawImage(fruit[fruit1], 170, 200, this);
		g.drawImage(fruit[fruit2], 80, 200, this);
		g.drawImage(fruit[fruit3], 250, 200, this);
		if (geld == 0) {
			Knop.setEnabled(false);
			Knop2.setEnabled(true);
		}
		if (geld == 10) {
			Knop.setEnabled(true);
			Knop2.setEnabled(false);
			;
		}
		if (fruit1 == fruit2 && fruit2 == fruit3) {
			g.drawString("20 punten gewonnen", 170, 470);
			geld += 20;
		} else if (fruit1 == fruit2 || fruit2 == fruit3 || fruit3 == fruit1) {
			g.drawString("4 punten gewonnen", 170, 450);
			geld += 4;
		}
		g.drawString("Krediet = " + geld, 170, 400);
	}

	class SpeelKnopLuisteraar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			fruit1 = (int) (Math.random() * 20);
			fruit2 = (int) (Math.random() * 20);
			fruit3 = (int) (Math.random() * 20);
			geld -= 1;
			repaint();

		}
	}

	class KredietKnopLuisteraar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			geld += 10;
			repaint();
		}
	}

}
