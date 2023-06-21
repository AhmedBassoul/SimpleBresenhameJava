import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Forme{
	
	private Point pointDeparte;
	private float longueur,largeur;
	
	public Rectangle(String Couleur,Point pointDeparte,float longueur, float largeur) {
		super(Couleur);
		this.longueur = longueur;
		this.largeur = largeur;
		this.pointDeparte = pointDeparte;
	}
	
	public Point getPointDeparte() {
		return pointDeparte;
	}

	public void setPointDeparte(Point pointDeparte) {
		this.pointDeparte = pointDeparte;
	}

	public float getLongueur() {
		return longueur;
	}

	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}

	public float getLargeur() {
		return largeur;
	}

	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}

	@Override
	public double getSurface() {
		return this.largeur*this.longueur;
	}

	@Override
	public String print() {
		String str = "Longueur : " +this.longueur+"Largeur"+this.largeur;
		return str;
	}

	@Override
	public double getPerimetre() {
		return 2*(this.largeur+this.longueur);
	}

	@Override
	public void move(int transX, int transY) {
		this.pointDeparte.setAbscisse(this.pointDeparte.getAbscisse()+transX);
		this.pointDeparte.setOrdonnee(this.pointDeparte.getOrdonnee()+transY);
	}

	@Override
	public void homothetie(float vecteur) {
		this.setLargeur(this.getLargeur()*vecteur);
		this.setLongueur(this.getLongueur()*vecteur);
	}
	
	public void paint(Color c,Graphics g) {
		g.setColor(c);
		for(int i =0;i<3;i++) 
			g.drawRect(this.getPointDeparte().getAbscisse()+i, this.getPointDeparte().getOrdonnee()+i,(int)this.getLongueur(),(int)this.getLargeur());
	}
}