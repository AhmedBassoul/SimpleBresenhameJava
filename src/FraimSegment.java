import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FraimSegment extends FraimTest{
	public FraimSegment() {
		this.longueurFrame = 790;
		this.largeurFrame = 600;
		
		fram = new JFrame();
		fram.setTitle("Segment");
		fram.setSize(longueurFrame,largeurFrame);
		fram.setLocationRelativeTo(null);
		fram.setVisible(true);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setLayout(new FlowLayout());
		fram.setResizable(false);
		
		container = new JPanel();
		top = new JPanel();
		
		container.setLayout(new BorderLayout());

		getVal1 = new JTextField();
		getVal2 = new JTextField();
		getVal3 = new JTextField();
		getVal4 = new JTextField();
		
		getVal1.setPreferredSize(new Dimension(300,20));	
		getVal2.setPreferredSize(new Dimension(300,20));
		getVal3.setPreferredSize(new Dimension(300,20));
		getVal4.setPreferredSize(new Dimension(300,20));	
		
		label1 = new JLabel("Donner Les Cordonnees Du point de depart (l'abscisse) :");
		label2 = new JLabel("Donner Les Cordonnees Du point de depart (l'ordonnee) :");
		label3 = new JLabel("Donner Les Cordonnees Du point d'arrive  (l'abscisse) :");
		label4 = new JLabel("Donner Les Cordonnees Du point d'arrive  (l'ordonnee) :");
		
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

		forDessine.setBounds(10, 150, 755, 405);
		container.add(forDessine);
		
		container.add(top);
		fram.setContentPane(container);
		fram.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Segment s = new Segment((String)combo.getSelectedItem(),new Point(Integer.parseInt(getVal1.getText()),Integer.parseInt(getVal2.getText())),new Point(Integer.parseInt(getVal3.getText()),Integer.parseInt(getVal4.getText())));
		s.paint(s.getCouleur(),forDessine.getGraphics());
	}
}