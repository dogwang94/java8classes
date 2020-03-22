package lambdasorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSorting {

	public static void main(String[] args) {

		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(14);
		l.add(8);
		l.add(98);
		l.add(56);
		l.add(72);
		
		System.out.println("Before Sorting: " +l);
		//Collections.sort(l, new SComparator());
		//use Lambda 
		Collections.sort(l, (i1, i2) ->(i1>i2)?-1:(i1<i2)?1:0);
		System.out.println("After Sorting: " +l);
		
	}

}

/*
 * class SComparator implements Comparator<Integer>{
 * 
 * public int compare(Integer i1, Integer i2) { return (i1>i2)?-1:(i1<i2)?1:0; }
 * }
 */
