package lambdasorting;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	
	public static List<Employee> getEmployees() {
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(176, "Roshan", "IT", 600000));
		emplist.add(new Employee(388, "Bikash", "IT", 900000));
		emplist.add(new Employee(470, "Bimal", "DEFENCE", 500000));
		emplist.add(new Employee(624, "Prakash", "CORE", 400000));
		emplist.add(new Employee(243, "Sourav", "SOCIAL", 1200000));
		emplist.add(new Employee(287, "Lilly", "INFO", 800000));
		return emplist;
	}

}
