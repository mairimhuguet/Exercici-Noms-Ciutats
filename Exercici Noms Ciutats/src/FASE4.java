import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import com.sun.org.apache.xpath.internal.axes.ReverseAxesWalker;


public class FASE4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		//Introducir ciudades
	String [] ciudades_init = {"Barcelona", "Madrid", "Valencia", "Malaga", "Cadis", "Santander"};	
	
	//Iniciar Arraylist. 4.1
	ArrayList<char[]> CiudadArray = new ArrayList<char[]>();
	for(int i = 0;i<ciudades_init.length;i++)
	{
		// Crear Char Array para cada ciudad
		CiudadArray.add(new char[ciudades_init[i].length()]);
		
		//4.2
		char [] temp = new char[ciudades_init[i].length()];
		
		for (int j = 0;j<ciudades_init[i].length();j++)
		{
			temp[j]=ciudades_init[i].charAt(j);
		}
		
		CiudadArray.set(i, temp);
		
		//4.3
		System.out.print(ciudades_init[i] + " - ");
		for (int j = CiudadArray.get(i).length-1; j >= 0 ; j--){
		    System.out.print(CiudadArray.get(i)[j]);			
		}
		System.out.print("\n");	
	}
}
}	