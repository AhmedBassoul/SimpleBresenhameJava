import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;

public class FraimRectangle extends FraimTest{
	public FraimRectangle() {
		this.longueurFrame = 710;
		this.largeurFrame = 600;
		
		fram.setTitle("Rectangle");
		fram.setSize(longueurFrame,largeurFrame);
		fram.setLocationRelativeTo(null);
		fram.setVisible(true);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setResizable(false);
		
		forDessine.setBounds(170, 150, 520, 405);

		
		container = new JPanel();
		container.add(forDessine);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 0));
		container.add(panel);
		top = new JPanel();
		
		container.setLayout(new BorderLayout());
		
		label1 = new JLabel("Donner Cordonnees du Point (l'abscisse) :");
		label2 = new JLabel("Donner Cordonnees du Point (l'ordonne) : ");
		label3 = new JLabel("Donner la Longueur du Recrangle :  ");
		label4 = new JLabel("Donner le Largeur  du Recrangle :  ");
		
		getVal1 = new JTextField();
		getVal2 = new JTextField();
		getVal3 = new JTextField();
		getVal4 = new JTextField();
		
		getVal1.setPreferredSize(new Dimension(300,20));	
		getVal2.setPreferredSize(new Dimension(300,20));
		getVal3.setPreferredSize(new Dimension(300,20));
		getVal4.setPreferredSize(new Dimension(300,20));

		
		top.add(label1);
		top.add(getVal1);

		top.add(label2);
		top.add(getVal2);		

		top.add(label3);
		top.add(getVal3);
		
		
		top.add(label4);
		top.add(getVal4);

		top.add(combo);
		combo.addActionListener(this);
		
		
		container.add(top);
		
		fram.setContentPane(container);
		fram.setVisible(true);
	}
	


	public void actionPerformed(ActionEvent e) {
		Rectangle r = new Rectangle((String)combo.getSelectedItem(),new Point(Integer.parseInt(getVal1.getText()),Integer.parseInt(getVal2.getText())),Integer.parseInt(getVal3.getText()),Integer.parseInt(getVal4.getText()));		
		r.paint(r.getCouleur(),forDessine.getGraphics());
		fram.getGraphics().drawString("Le Perimetre : "+Integer.toString((int)r.getPerimetre()), 20,300 );
		fram.getGraphics().drawString("La Surface : "+Integer.toString((int)r.getSurface()), 20,350 );		
	}
	

}