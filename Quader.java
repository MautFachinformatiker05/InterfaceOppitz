
public class Quader extends GeoOb  implements Volumenberechnung{
int laenge, hoehe, breite;
	
	public Quader  (int l, int h, int b){
		laenge=l;
		hoehe=h;
		breite=b;
		
	}
	
	public double getVolumen(){
		double volumen =laenge*hoehe*breite;
		return volumen;
	}

}
