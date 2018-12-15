package arraysDataStructurePractice;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		//hashmap is a class implements Map interface
		//extends abstractMap
		//it contains only uniqe elements
		//stores the value
		//it may have one null key and multiple null values
		//it maintains no order
		//hashmap is non synchronized--> multiple threads can access,not thread safe
		//concurrent modification exception -- fail--fast condition
		
    HashMap<Integer,String> m1 = new HashMap<Integer,String>();
    m1.put(19, "Bangladesh");// hashmap outcome doesn't maintain order
    m1.put(2, "India");
    m1.put(3, "Australia");
    m1.put(1000, "kisuparina");
    m1.put(4, null);
    System.out.println(m1.get(1));
    System.out.println(m1.entrySet());
    System.out.println(m1.remove(2));
    HashMap<Integer,Employee> m2 = new HashMap<Integer,Employee>();
    Employee emp1 = new Employee("nayna", 26, "QA");
	Employee emp2 = new Employee("nayna", 26, "QA");
	System.out.println("****equals");
	System.out.println(emp1.equals(emp2));
	Employee emp3 = new Employee("victor", 27, "QA");
    m2.put(1, emp1);
    m2.put(2, emp2);
    m2.put(3, emp3);
    System.out.println(m2.size());
    for(Entry <Integer, Employee> m : m2.entrySet()) {
    	m.getKey();
    	Employee e = m.getValue();
    	System.out.println(m.getKey()+"---> "+e.name+" "+e.age+" "+e.dept);
    	
    }
	}

}
