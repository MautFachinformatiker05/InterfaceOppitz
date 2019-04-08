import java.util.Arrays;
import java.util.Comparator;

public class SortArrayString {

	public static void main(String[] args) {
		String [] stringArray ={"Herwig", "Berta","Anna", "arnold","Gustav"};
		
		Arrays.sort(stringArray,new Comparator<String>(){
			@Override
			public int compare(String first, String second){
				return first.toLowerCase().compareTo(second.toLowerCase());
			}
			
		});
		
		System.out.println(Arrays.toString(stringArray));
		 
	}

}
