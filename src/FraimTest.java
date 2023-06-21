import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FraimTest implements ActionListener{
	
	protected int longueurFrame;
	protected int largeurFrame ;
	
	protected static JFrame fram = new JFrame();
	
	protected JLabel label1,label2,label3,label4,label5,label6,label7;
	protected JTextField getVal1,getVal2,getVal3,getVal4,getVal5,getVal6,getVal7;
	
	protected JPanel container = new JPanel();
	protected JPanel top = new JPanel();
	protected JPanel forDessine = new JPanel();
	
	protected JLabel choix = new JLabel ("Vorte Choix : ");
	protected Button b1 = new Button("Cercle");
	protected Button b2 = new Button("Segment");
	protected Button b3 = new Button("Rectangle");
	protected Button b4 = new Button("Ellipse");
	protected Button exitButton = new Button("Sortir");
	
	protected String s1[]= {"BLACK","BLUE","CYAN","DARK_GRAY","GREEN","MAGENTA","ORANGE","YELLOW","RED","PINK"};
	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected JComboBox combo = new JComboBox(s1);
	
	public FraimTest(){
		this.longueurFrame =300;
		this.largeurFrame = 150;
		fram.setTitle("Mini Projet Poo");
		fram.setSize(longueurFrame,largeurFrame);
		fram.setLocationRelativeTo(null);
		fram.setVisible(true);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setResizable(false);
		fram.setLayout(null);
        
		forDessine.setBounds(170, 150, 550, 405);
		forDessine.setBorder(BorderFactory.createMatteBorder(2,2,2,2, Color.BLACK));
		
		top.setBackground(Color.LIGHT_GRAY);
		container.setBackground(Color.LIGHT_GRAY);
		
		choix.setPreferredSize(new Dimension(250,20));
		top.add(choix,BorderLayout.WEST);
		
		b1.setBackground(Color.ORANGE);
		b1.setForeground(Color.RED);
		b1.addActionListener(this);
	
		b2.setBackground(Color.ORANGE);
		b2.setForeground(Color.RED);
		b2.addActionListener(this);
		
		b3.setBackground(Color.ORANGE);
		b3.setForeground(Color.RED);
		b3.addActionListener(this);
	
		b4.setBackground(Color.ORANGE);
		b4.setForeground(Color.RED);
		b4.addActionListener(this);
		
		exitButton.setBackground(Color.ORANGE);
		exitButton.setForeground(Color.RED);
		exitButton.addActionListener(this);
		
		container.add(top);
		container.add(b1);
		container.add(b2);
		container.add(b3);
		container.add(b4);
		container.add(exitButton,BorderLayout.SOUTH);
		fram.setContentPane(container);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(exitButton))
			System.exit(0);
		if(e.getSource().equals(b1))
			new FraimeCercle();
		if(e.getSource().equals(b2))
			new FraimSegment();
		if(e.getSource().equals(b3))
			new FraimRectangle();
		if(e.getSource().equals(b4))
			new FraimeEllipse();
	}
}