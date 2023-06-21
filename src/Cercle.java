import java.awt.Color;
import java.awt.Graphics;

public class Cercle extends Forme{
	
	private Point Centre;
	private float rayon;
	
	public Cercle(String couleur,Point centre, int rayon) {
		super(couleur);
		this.Centre = centre;
		if(rayon > 0)
			this.rayon = rayon;
	}
	
	public Point getCentre() {
		return Centre;
	}

	public void setCentre(Point centre) {
		Centre = centre;
	}

	public float getRayon() {
		return rayon;
	}

	public void setRayon(float rayon) {
		this.rayon = rayon;
	}

	@Override
	public double getSurface() {
		return Math.PI*rayon*rayon;
	}

	@Override
	public String print() {
		return "Cercle(("+Centre.getAbscisse()+","+Centre.getOrdonnee()+"),"+rayon+")";
	}

	@Override
	public double getPerimetre() {
		return 2*Math.PI*rayon;
	}

	@Override
	public void move(int transX,int transY) {
		this.getCentre().setAbscisse(this.Centre.getAbscisse()+transX);
		this.getCentre().setOrdonnee(this.Centre.getOrdonnee()+transY);
	}

	@Override
	public void homothetie(float vecteur) {
		this.setRayon(this.getRayon()*vecteur);
	}
	
	public void paint(Color c,Graphics g) {
		Bresenhame.DrawCircle(c,g,this.getCentre().getAbscisse(),this.getCentre().getOrdonnee(),this.getRayon());
	}
	
}