package predefinedfunctionalinterface;

import java.util.function.Predicate;

public class PredicateFunctionalInterface {

	public static void main(String[] args) 
	{
		Predicate<Integer> p = i->i%2==0;
		
		System.out.println(p.test(200));
		System.out.println(p.test(155));
	}
	
	//before lambda
//	public boolean test(Integer I)
//	{
//		if(I%2==0)
//		{
//			return true;
//		} else {
//			return false;
//		}
//	}
	// with lambda
//	(integer I) -> I%2==0;
//	I -> I%2==0;

}
