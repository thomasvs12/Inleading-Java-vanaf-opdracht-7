package dobbelsteen;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Javaherkansing extends Applet {
	Button Gooi;
	int random;
    AudioClip sound;
	double naam;
	int hoogste =0;
	int dice1;
	int dice2;
	int dice3;
	String worp;
	int dice4;
	int dice5;
	Image[] dobbelsteen;
	
	@Override
	public void init() {
		setSize(400, 400);
		dobbelsteen = new Image[6];
		for (int i = 0; i < dobbelsteen.length; i++) {
			dobbelsteen[i] = getImage(getCodeBase(), "dobbelsteen/doublesteen" + (i + 1) + ".png");
}
		{
	Gooi = new Button("Gooi");
	Gooi.addActionListener(new GooiKnopLuisteraar());
	add(Gooi);
	 sound = getAudioClip(getDocumentBase(), "dobbelsteen/applaus.wav");
	worp = "hoogste score:" + hoogste;
	naam = Math.random();
	random = (int) (naam * 5 + 1);
	dice1 = (int) (Math.random() * 6);
	dice2 = (int) (Math.random() * 6);
	dice3 = (int) (Math.random() * 6);
	dice4 = (int) (Math.random() * 6);
	dice5 = (int) (Math.random() * 6);
	
}
	}
		@Override
		public void paint(Graphics g) {
			g.drawImage(dobbelsteen[dice1], 100, 200, this);
			g.drawImage(dobbelsteen[dice2], 170, 200, this);
			g.drawImage(dobbelsteen[dice3], 240, 200, this);
			g.drawImage(dobbelsteen[dice4], 310, 200, this);
			g.drawImage(dobbelsteen[dice5], 380, 200, this);
			g.drawString(worp, 170, 400);
			
			
			
			
}
		class GooiKnopLuisteraar implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				dice1 = (int) (Math.random() * 6);
				dice2 = (int) (Math.random() * 6);
				dice3 = (int) (Math.random() * 6);
				dice4 = (int) (Math.random() * 6);
				dice5 = (int) (Math.random() * 6);
//				dice1 = 1;
//				dice2 = 1;
//				dice3 = 1;
//				dice4 = 1;
//				dice5 = 1;
				
				if(dice1+dice2+dice3+dice4+dice5 > hoogste){
					hoogste = dice1+dice2+dice3+dice4+dice5;
				};
					
				if(dice1 == dice2 && dice1 == dice3 && dice1 == dice4 && dice1 == dice5) {
				sound.play();
				}
				
				worp = "hoogste score:" + hoogste;
				repaint();
				
			}
		}
}
