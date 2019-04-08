import java.util.Arrays;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		Kugel k = new Kugel(5);
		Pyramide p = new Pyramide(5, 3, 19);
		Quader q = new Quader(9, 17, 2);
		
		GeoOb array[] = { k, p, q };

		for (GeoOb gk : array) {
			System.out.println("Volumen ist = " + gk.getVolumen());
		}

		System.out.println("\n\n\n");
		Tasse t = new Tasse();
		Buch b = new Buch();
		Object d[] = { t, new Tasse(), new Tasse(), new Tasse(), p, q, k, b };

		Volumenberechnung v[] = { t, new Tasse(), new Tasse(), new Tasse(), p, q, k };
		
		for (Volumenberechnung h:v){
			System.out.println(h.getVolumen());
		}
		
		System.out.println("\n\n\n");
		
		Arrays.sort(v,new Comparator<Volumenberechnung>(){
			@Override
			public int compare(Volumenberechnung first, Volumenberechnung second){
				
					double volA=first.getVolumen();
					double volB=second.getVolumen();
				return (int)(volA-volB);
			}
			
		});
		
		for (Volumenberechnung h:v){
			System.out.println(h.getVolumen());
			
		}
		
		
		
//		for (Volumenberechnung a : v) {
//			System.out.println("Volumen " + a.getVolumen());
//		}
//		for (Object z : d) {
//			if (z instanceof Buch) {
//					System.out.println("Ein buch " +z);
//			}
//			if (z instanceof Volumenberechnung) {
//				
//
//			}
//			if (z instanceof GeoOb) {
//				System.out.println("Ein GeoOb " +z );
//
//			}

		}

	}


