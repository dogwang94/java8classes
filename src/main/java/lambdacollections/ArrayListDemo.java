package lambdacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al =  new ArrayList<Integer>();
		al.add(3);
		al.add(7);
		al.add(20);
		al.add(13);
		al.add(38);
		al.add(21);
		al.add(9);
		al.add(45);
		al.add(0);
		
		System.out.println(al);	
		Comparator<Integer> c=(i1,i2)->(i1<i2)?-1: (i1>i2)?+1:0;
		//Collections.sort(al, new AlComparator());
		Collections.sort(al,c);
		System.out.println(al);
		
		al.stream().forEach(System.out::println);
		
		List<Integer> al2 = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(al2);
		
	}

}

//class AlComparator implements Comparator<Integer>
//{
//	
//	public int compare(Integer i1, Integer i2) 
//	{
//		
////		if (i1<i2)
////		{
////			return -1;
////		}
////		else if (i1>i2)
////		{
////			return +1;
////		}
////		else
////		{
////			return 0;
////		}
//		
//		return (i1<i2)?-1: (i1>i2)?+1:0;
//	}
//}
