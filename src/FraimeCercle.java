import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FraimeCercle extends FraimTest {		
	public FraimeCercle(){
		this.longueurFrame = 730;
		this.largeurFrame = 600;
		
		fram.setTitle("Cercle");
		fram.setSize(longueurFrame,largeurFrame);
		fram.setLocationRelativeTo(null);
		fram.setVisible(true);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setLayout(new FlowLayout());
		fram.setResizable(false);
		
		container = new JPanel();
		container.add(forDessine);
		top = new JPanel();
		container.setLayout(new BorderLayout());
		
		label1 = new JLabel("Donner Cordonnees de Centre (l'abscisse) : ");
		label2 = new JLabel("Donner Cordonnees de Centre (l'ordonne) : ");
		label3 = new JLabel("Donner le rayon : ");
		label4 = new JLabel("Translation X : ");
		label5 = new JLabel("Translation Y : ");
		label6 = new JLabel("Homoothetie : ");
		
		getVal1 = new JTextField();
		getVal2 = new JTextField();
		getVal3 = new JTextField();
		getVal4 = new JTextField();
		getVal5 = new JTextField();
		getVal6 = new JTextField();
		
		getVal1.setPreferredSize(new Dimension(400,20));	
		getVal2.setPreferredSize(new Dimension(400,20));
		getVal3.setPreferredSize(new Dimension(400,20));
		getVal4.setPreferredSize(new Dimension(200,20));
		getVal5.setPreferredSize(new Dimension(200,20));
		getVal6.setPreferredSize(new Dimension(200,20));
		
		b2 = new Button("Valider");
		b3 = new Button("Valider");
		
		
		top.add(label1);
		top.add(getVal1);

		top.add(label2);
		top.add(getVal2);		

		top.add(label3);
		top.add(getVal3);
		

		top.add(combo);
		combo.addActionListener(this);
		
		top.add(label4);
		top.add(getVal4);
		
		top.add(label5);
		top.add(getVal5);
		top.add(b2);
		b2.setEnabled(false);
		b2.addActionListener(this);
		
		top.add(label6);
		top.add(getVal6);
		b3.setEnabled(false);
		top.add(b3);
		b3.addActionListener(this);
		
		container.add(top);
		
		fram.setContentPane(container);
		fram.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Cercle c = new Cercle((String)combo.getSelectedItem(),new Point(Integer.parseInt(getVal1.getText()),Integer.parseInt(getVal2.getText())),Integer.parseInt(getVal3.getText()));		
		c.paint(c.getCouleur(),forDessine.getGraphics());
		fram.getGraphics().drawString("Le Perimetre : "+Integer.toString((int)c.getPerimetre()), 20,300 );
		fram.getGraphics().drawString("La Surface : "+Integer.toString((int)c.getSurface()), 20,350 );		
		b2.setEnabled(true);
		b3.setEnabled(true);
		if(e.getSource().equals(b2)) {
			c.move(Integer.parseInt(getVal4.getText()),Integer.parseInt(getVal5.getText()));
			c.paint(c.getCouleur(),forDessine.getGraphics());
		}
		if(e.getSource().equals(b3)) {
			c.homothetie(Float.parseFloat(getVal6.getText()));
			c.paint(c.getCouleur(),forDessine.getGraphics());
		}
	}
}