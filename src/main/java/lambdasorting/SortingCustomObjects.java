package lambdasorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingCustomObjects {

	public static void main(String[] args) {

		List<Employee> employees = DataBase.getEmployees();
		
		Collections.sort(employees, new empComparator());
		
		System.out.println(employees);

	}

}

class empComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getSalary()-o2.getSalary();	//Ascending
		
	}
}
