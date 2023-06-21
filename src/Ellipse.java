import java.awt.Color;
import java.awt.Graphics;

public class Ellipse extends Forme {
	
	private Point centre;
	private float rayonP,rayonG;
	
	public Ellipse(String couleur, Point centre, float rayonP, float rayonG) {
		super(couleur);
		this.centre = centre;
		if(rayonP>rayonG) {
			this.rayonG = rayonP;
			this.rayonP = rayonG;
		}
		else {
			this.rayonG = rayonG;
			this.rayonP = rayonP;			
		}
	}
	
	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public float getRayonP() {
		return rayonP;
	}

	public void setRayonP(float rayonP) {
		this.rayonP = rayonP;
	}

	public float getRayonG() {
		return rayonG;
	}

	public void setRayonG(float rayonG) {
		this.rayonG = rayonG;
	}

	@Override
	public double getSurface() {
		return Math.PI*rayonP*rayonG;
	}

	@Override
	public String print() {
		return "Ellipse(("+centre.getAbscisse()+","+centre.getOrdonnee()+"),"+rayonG+","+rayonP+")";
	}

	@Override
	public double getPerimetre() {
		return 2*Math.PI*Math.sqrt((Math.pow(rayonG,2)+Math.pow(rayonP,2)/2));
	}

	@Override
	public void move(int transX, int transY) {
		this.getCentre().setAbscisse(this.centre.getAbscisse()+transX);
		this.getCentre().setOrdonnee(this.centre.getOrdonnee()+transY);
	}

	@Override
	void homothetie(float vecteur) {
		this.setRayonG(this.getRayonG()*vecteur);
		this.setRayonP(this.getRayonP()*vecteur);
	}
	
	public void paint(Color c,Graphics g) {
		g.setColor(c);
		g.drawOval(this.getCentre().getAbscisse(),this.getCentre().getOrdonnee(),(int)this.getRayonG(),(int)this.getRayonP());
	}
}
 