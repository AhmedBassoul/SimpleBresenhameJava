public class Point {
	
	private int abscisse,ordonnee;
	
	public Point() {
		
	}
	public Point(int abscisse, int ordonnee) {
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}
	public int getAbscisse() {
		return abscisse;
	}
	public void setAbscisse(int abscisse) {
		this.abscisse = abscisse;
	}
	public int getOrdonnee() {
		return ordonnee;
	}
	public void setOrdonnee(int ordonnee) {
		this.ordonnee = ordonnee;
	}
	public String print() {
		return "("+this.abscisse+","+this.ordonnee+")";
	}
}