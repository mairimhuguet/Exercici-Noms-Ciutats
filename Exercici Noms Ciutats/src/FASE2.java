import java.util.ArrayList;
import java.util.Collections;

public class FASE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ciudad1="Barcelona";
		String ciudad2="Madrid";
		String ciudad3="Valencia";
		String ciudad4="Malaga";
		String ciudad5="Cadis";
		String ciudad6="Santander";
		
		
		ArrayList<String> ciudad = new ArrayList<String>();
	    ciudad.add(ciudad1);
	    ciudad.add(ciudad2);
	    ciudad.add(ciudad3);
	    ciudad.add(ciudad4);
	    ciudad.add(ciudad5);
	    ciudad.add(ciudad6);
	    
	    Collections.sort(ciudad); 
	    System.out.println(ciudad);
	}

}