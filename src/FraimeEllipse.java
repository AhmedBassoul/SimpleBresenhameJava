import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FraimeEllipse extends FraimTest{
	public FraimeEllipse() {
		this.longueurFrame = 740;
		this.largeurFrame = 600;
		
		fram = new JFrame();
		fram.setTitle("Ellipse");
		fram.setSize(longueurFrame,largeurFrame);
		fram.setVisible(true);
		fram.setLocationRelativeTo(null);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setLayout(new FlowLayout());
		fram.setResizable(false);
		
		container = new JPanel();
		top = new JPanel();
	    
		container.setLayout(new BorderLayout());

		container.add(forDessine);
		getVal1 = new JTextField();
		getVal2 = new JTextField();
		getVal3 = new JTextField();
		getVal7 = new JTextField();
		getVal4 = new JTextField();
		getVal5 = new JTextField();
		getVal6 = new JTextField();
		
		getVal1.setPreferredSize(new Dimension(400,20));	
		getVal2.setPreferredSize(new Dimension(400,20));
		getVal3.setPreferredSize(new Dimension(450,20));
		getVal4.setPreferredSize(new Dimension(200,20));
		getVal5.setPreferredSize(new Dimension(200,20));
		getVal6.setPreferredSize(new Dimension(200,20));
		getVal7.setPreferredSize(new Dimension(400,20));
		
		label1 = new JLabel("Donner Cordonnees de Centre (l'abscisse) : ");
		label2 = new JLabel("Donner Cordonnees de Centre (l'ordonne) : ");
		label3 = new JLabel("Donner le petit rayon : ");
		label7 = new JLabel("Donner le grand rayon : ");

		
		top.add(label1);
		top.add(getVal1);

		top.add(label2);
		top.add(getVal2);		

		top.add(label3);
		top.add(getVal3);
		
		top.add(label7);
		top.add(getVal7);
		
		top.add(combo);
		combo.addActionListener(this);	
		
		container.add(top);
		fram.setContentPane(container);
		fram.setVisible(true);
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		Ellipse el = new Ellipse((String)combo.getSelectedItem(),new Point(Integer.parseInt(getVal1.getText()),Integer.parseInt(getVal2.getText())),Integer.parseInt(getVal3.getText()),Integer.parseInt(getVal7.getText()));		
		el.paint(el.getCouleur(),forDessine.getGraphics());
		fram.getGraphics().drawString("Le Perimetre : "+Integer.toString((int)el.getPerimetre()), 20,300 );
		fram.getGraphics().drawString("La Surface : "+Integer.toString((int)el.getSurface()), 20,350 );
	}
}