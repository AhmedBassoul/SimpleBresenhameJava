import java.awt.Color;

abstract class Forme extends Point{
	
	protected Color couleur;

    public Forme(String couleur) {
		this.setCouleur(couleur);
	}

    public Color getCouleur() {
		return couleur;
	}

    public void setCouleur(String couleur) {
		if(couleur.equals("BLACK"))
			this.couleur = Color.BLACK;
		if(couleur.equals("BLUE"))
			this.couleur = Color.BLUE;
		if(couleur.equals("CYAN"))
			this.couleur = Color.CYAN;
		if(couleur.equals("DARK_GRAY"))
			this.couleur = Color.DARK_GRAY;
		if(couleur.equals("GREEN"))
			this.couleur = Color.GREEN;
		if(couleur.equals("MAGENTA"))
			this.couleur = Color.MAGENTA;
		if(couleur.equals("ORANGE"))
			this.couleur = Color.ORANGE;
		if(couleur.equals("YELLOW"))
			this.couleur = Color.YELLOW;
		if(couleur.equals("RED"))
			this.couleur = Color.RED;
		if(couleur.equals("PINK"))
			this.couleur = Color.PINK;
	}

    abstract public double getSurface();
    abstract public String print();
    abstract public double getPerimetre();
    abstract public void move(int transX,int transY);
    abstract void homothetie(float vecteur);

}