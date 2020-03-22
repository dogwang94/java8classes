package lambdasorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<>();
		mylist.add(12);
		mylist.add(15);
		mylist.add(19);
		mylist.add(8);
		mylist.add(3);
		mylist.add(5);
//		Collections.sort(mylist); //Ascending
//		Collections.reverse(mylist); //Descending
		
		mylist.stream().sorted().forEach(s->System.out.println(s)); //Ascending by Lambda		
		mylist.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s)); //Descending by Lambda
		
		System.out.println(mylist);

	}

}
