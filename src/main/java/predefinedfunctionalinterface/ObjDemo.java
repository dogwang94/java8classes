package predefinedfunctionalinterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
	String name;
	double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}	
}

public class ObjDemo 
{
	public static void main(String[] args)
	{
		ArrayList<Employee> empl = new ArrayList<Employee>();
		empl.add(new Employee("Lilly", 4000));
		empl.add(new Employee("Lucy", 8000));
		empl.add(new Employee("Christine", 6000));
		empl.add(new Employee("Byrace", 9000));
		empl.add(new Employee("Vivn", 10000));
		empl.add(new Employee("Yun", 7000));
		empl.add(new Employee("Elizabas", 4000));
		
		Predicate<Employee> p = e -> e.salary>4000;
		for (Employee e1 : empl) {
			if(p.test(e1))
			{
				System.out.println(e1.name+" "+e1.salary);
			}
		}
	}

}
