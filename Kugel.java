
public class Kugel extends GeoOb  implements Volumenberechnung{
	double radius;
	public Kugel (double r){
		radius=r;
	}
	public double getVolumen(){
		return 4/3.*Math.PI*radius*radius*radius;
	}

}
