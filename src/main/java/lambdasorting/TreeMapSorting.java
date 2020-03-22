package lambdasorting;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSorting {

	public static void main(String[] args) {
		//defaut sorting order with no arguments
		//TreeMap<Integer, String> m= new TreeMap<Integer, String>();	
		
		//custom sorting order with arguments
		TreeMap<Integer, String> m= new TreeMap<Integer, String>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		m.put(1, "Lilly");
		m.put(6, "Christion");
		m.put(3, "Lucy");
		m.put(2, "Bryce");
		m.put(7, "Oliva");
		m.put(4, "Elisbas");
		m.put(9, "Yun");

		System.out.println(m);
									
	}

}

// lambda expression Comparator
//(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0

