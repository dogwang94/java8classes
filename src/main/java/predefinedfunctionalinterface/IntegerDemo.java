package predefinedfunctionalinterface;

import java.util.function.Predicate;

public class IntegerDemo {

	public static void main(String[] args) 
	{
		int[] arr= {0,5,10,15,20,25,30,35,40};
		
		Predicate<Integer> p1 = i-> i%2==0;
		Predicate<Integer> p2 = i-> i>10;

		// and(), or(), negate() operators
		System.out.println("The numbers which are even and  > 10 are: ");
		for (int arr1 : arr)
		{
			if(p1.and(p2).test(arr1))
			{
				System.out.println(arr1);
			}

		}
		
		System.out.println("The numbers which are even or > 10 are: ");
		for (int arr1 : arr)
		{
			if(p1.or(p2).test(arr1))
			{
				System.out.println(arr1);
			}

		}
		
		System.out.println("The numbers which are not even are: ");
		for (int arr1 : arr)
		{
			if(p1.negate().test(arr1))
			{
				System.out.println(arr1);
			}

		}
	}

}
