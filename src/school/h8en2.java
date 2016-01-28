package school;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class h8en2 extends Applet {
	Button mButton;
	Button vButton;
	Button mlButton;
	Button vlButton;
	int man;
	int vrouw;
	int vrouwL;
	int manL;
	int totaal;
	
	public void init(){
		setSize(500, 400);
		
		mButton = new Button("man");
		ManKnopLuisteraar mkl = new ManKnopLuisteraar();
		mButton.addActionListener(mkl);
		add(mButton);
		//
		vButton = new Button ("vrouw");
		VrouwKnopLuisteraar vkl = new VrouwKnopLuisteraar();
		vButton.addActionListener(vkl);
		add(vButton);
		//
		mlButton = new Button ("man leerling");
		manLLKnopLuisteraar mlkl = new manLLKnopLuisteraar();
		mlButton.addActionListener(mlkl);
		add(mlButton);
		//
		vlButton = new Button ("vrouw leerling");
		VrouwLLKnopLuisteraar vlkl = new VrouwLLKnopLuisteraar();
		vlButton.addActionListener(vlkl);
		add(vlButton);
				
		
	}
		
	public void paint(Graphics g) {
		int x = 50;
		int y = 70;
		g.drawString("Aantal mannen: " + man, x, y);
		y = y + 20;
		g.drawString("Aantal vrouwen: " + vrouw, x, y);
		y = y + 20;
		g.drawString("Aantal mannelijke leerlingen: " + manL, x, y);
		y = y + 20;
		g.drawString("Aantal vrouwelijke leerlingen: " + vrouwL, x, y);
		y = y + 20;
		
	}
		
		
	class ManKnopLuisteraar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			man++;
			totaal++;
			repaint();
			
		}
		}
		
		class VrouwKnopLuisteraar implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				vrouw++;
				totaal++;
				repaint();
				
			}		
	}
		
			class manLLKnopLuisteraar implements ActionListener {
				public void actionPerformed(ActionEvent e) {
					manL++;
					totaal++;
					repaint();
				}	
			}
				
				class VrouwLLKnopLuisteraar implements ActionListener {
					public void actionPerformed(ActionEvent e) {
						vrouwL++;
						totaal++;
						repaint();
					} 
					 } 
		 } 

				
