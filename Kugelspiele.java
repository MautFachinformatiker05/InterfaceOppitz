
public class Kugelspiele {

	public static void main(String[] args) {

			Kugel k= new Kugel(5);
			System.out.println("Das Volumne von Kugel ist "+(int)k.getVolumen());
			
			Kugel halbeKugel=new Kugel(5){
				public  double getVolumen(){
					return 0.5*4/3.*Math.PI*radius*radius*radius;
				}
			};
			System.out.println("Das Volumen von halbekugel = " + (int)halbeKugel.getVolumen());
	}

}
