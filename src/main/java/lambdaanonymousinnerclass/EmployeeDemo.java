package lambdaanonymousinnerclass;

import java.util.ArrayList;
import java.util.Collections;

class Employee
{
	String name;
	int empid;
	public Employee(String name, int empid) {
		super();
		this.name = name;
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + "]";
	}
	
}
public class EmployeeDemo {

	public static void main(String[] args) {

		ArrayList<Employee> el = new ArrayList<Employee>();
		el.add(new Employee("Lilly",6839));
		el.add(new Employee("Lucy",8888));
		el.add(new Employee("Christin",1818));
		el.add(new Employee("Byrace",6570));
		el.add(new Employee("Oliva",2468));
		el.add(new Employee("Yun",9214));
		el.add(new Employee("Elisbeze",3256));
		
		System.out.println(el);
		Collections.sort(el, (e1, e2)->e1.name.compareTo(e2.name));
		System.out.println(el);
	}

}
