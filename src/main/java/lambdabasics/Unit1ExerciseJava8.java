package lambdabasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseJava8 {

	public static void main(String[] args) {
		List<Person> p = Arrays.asList(new Person("Lilly", "Wang", 60), new Person("Christin", "Yao", 25),
				new Person("Lucy", "Tu", 52), new Person("Bryace", "Yu", 20), new Person("Hong", "Huang", 60));

		// step1: Sory list by lastName
		Collections.sort(p, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}

		});

		// step2: Creae a method that prints all elements in the list
		System.out.print("All people here\n");
		printAll(p);

		// step3: Create a method that prints all people that have lastName beginning
		// with Y
		// printLastNamewithY(p);
		System.out.print("All people LastName start with Y\n");
		printConditionally(p, new Condition() {

			@Override
			public boolean test(Person person) {
				// TODO Auto-generated method stub
				return person.getLastName().startsWith("Y");
			}

		});

		System.out.print("All people FirstName start with L\n");
		printConditionally(p, new Condition() {

			@Override
			public boolean test(Person person) {
				// TODO Auto-generated method stub
				return person.getFirstName().startsWith("L");
			}

		});

	}

//	private static void printLastNamewithY(List<Person> person) {
//		for (Person p: person) {
//			if(p.getLastName().startsWith("Y")){
//				System.out.print(p+ "\n");
//			}				
//		}
//		
//	}
	private static void printConditionally(List<Person> person, Condition condition) {
		for (Person p : person) {
			if (condition.test(p)) {
				System.out.print(p + "\n");
			}
		}

	}

	private static void printAll(List<Person> person) {
		for (Person p : person) {
			System.out.print(p + "\n");

		}
		System.out.print("**********************\n");
	}

}

