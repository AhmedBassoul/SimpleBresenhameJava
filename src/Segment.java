import java.awt.Color;
import java.awt.Graphics;

public class Segment extends Forme{

	private Point debut,fin;

	public Segment(String couleur,Point debut, Point fin) {
		super(couleur);
		this.debut = debut;
		this.fin = fin;
	}

	public Point getDebut() {
		return debut;
	}

	public void setDebut(Point debut) {
		this.debut = debut;
	}

	public Point getFin() {
		return fin;
	}

	public void setFin(Point fin) {
		this.fin = fin;
	}

	@Override
	public double getSurface() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String print() {
		String str = "Point D'epart : "+this.debut.print()+" Point D'arrive : "+ this.fin.print();
		return str;
	}

	@Override
	public double getPerimetre() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move(int transX, int transY) {
		this.setDebut(new Point(this.getDebut().getAbscisse()+transX,this.getDebut().getOrdonnee()+transY));
		this.setFin(new Point(this.getFin().getAbscisse()+transX,this.getFin().getOrdonnee()+transY));
	}

	@Override
	void homothetie(float vecteur) {
		// TODO Auto-generated method stub
	}
	
	public void paint(Color c,Graphics g) {
		Bresenhame.drawLine(c,g,this.getDebut().getAbscisse(),this.getDebut().getOrdonnee(),this.getFin().getAbscisse(),this.getFin().getOrdonnee());
	}
}