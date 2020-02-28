package sef.ATestTask.FirstActivity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FirstActivity<employees> {

	public static void main(String[] args) {
       import java.util.ArrayList;
       import java.util.Collections;
       import java.util.List;
       import java.util.Comparator;



		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result
		Employee e1 = new Employee (1, "apprentice", "factory", 500);
		Employee e2 = new Employee (2, "engineer", "factory", 840);
		Employee e3 = new Employee (3, "engineer", "factory", 850);
		Employee e4 = new Employee (4, "instructor", "factory", 800);
		Employee e5 = new Employee (5, "constructor", "factory", 900);
		Employee e6 = new Employee (6, "guard", "factory", 430);

		/// Creating an ArrayList of String
		List<String> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);

		// UnSorted List
		System.out.println(employees);



        import java.util.Comparator;

		public class SalarySorter implements Comparator<Employee> {

			public int compare(Employee e1, Employee e2) {
				return e1.getSalary() - e2.getSalary();
			}
		}

		Collections.sort(employees, SalarySorter());

		// Sorted by salary
		System.out.println(employees);

		}

	//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		//TODO 3 create instance of a Student as a Person ->
		Student s = new Person();
		s.setFirstName("Janis");
		s.setAge(18);


		// than ask him introduce()
		//p.setName("Sarah Johnson");
	    //	p.setAge(21); than make them Student
		// than ask him introduce()



		//TODO 4 Create method for full change of employee information
		// for example some employee change his work


	}

	
	
}
