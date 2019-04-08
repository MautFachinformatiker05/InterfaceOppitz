
public class Pyramide extends GeoOb implements Volumenberechnung{
	double laenge, hoehe, breite;
	
	public Pyramide (double l, double h, double b){
		laenge=l;
		hoehe=h;
		breite=b;
		
	}
	
	public double getVolumen(){
		double volumen =1./3*laenge*hoehe*breite;
		return volumen;
	}

}
