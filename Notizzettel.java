import java.util.Arrays;

public class Notizzettel {
	
	String inhalt;
	int zettelnummer;
	static int seriennummer=1;
	
	public Notizzettel(String t){
		zettelnummer=seriennummer;
		seriennummer++;
		inhalt=t;
	}
	public static void main(String[] args) {
		
		System.out.println("Seriennummer"+seriennummer);
		Notizzettel n1 =new Notizzettel ("Heute einkaufen gehen");
		System.out.println("Seriennummer"+seriennummer);

		Notizzettel n2 =new Notizzettel ("Green book Tickets kaufen");
		System.out.println("Seriennummer "+seriennummer);

		Notizzettel n3 =new Notizzettel ("Regenschirm nicht vergessen");
		

		Notizzettel [] na={n1,n2,n3};
		System.out.println(Arrays.toString(na));
	}
	
	public String toString(){
		
		return zettelnummer + " : " +inhalt;
	}

}
