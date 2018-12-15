package arraysDataStructurePractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CollectionFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a[] = new int [3]; //static array
		//dynamic array = arraylist
		//1. can contain duplicate values/elements
		//2. maintains insertion order
		//3. synchronized
		//4.allows random access to fetch the element because it stores value on the basis of indexes
		ArrayList r = new ArrayList();
		r.add(10);
		r.add(80);
		r.add(30);
		//System.out.println(r.size());
		
		r.add(40);
		r.add(10);
		r.add(90);
		r.add("mike");
		r.add(true);
		r.add(10.78);
		System.out.println(r.size()); //size of arraylist
		System.out.println(r.get(8)); // to get the value from an index
		System.out.println("**********");
		//to print all values from arraylist we use for loop
		//using iterator
		
		for (int i = 0; i<r.size(); ++i) {
			System.out.println(r.get(i));
		}
		//non generic vs generic
		List<Integer> r1 = new ArrayList<Integer>(); //generic
		ArrayList<String> r2 = new ArrayList<String>();
		r.add("selenium");
		r.add("QTP");
		//List <E> r3 = new ArrayList<E>();
		
		//employee class objects:
		Employee emp1 = new Employee("nayna", 26, "QA");
		Employee emp2 = new Employee("mike", 26, "QA");
		Employee emp3 = new Employee("victor", 26, "QA");
		//create arraylist
		System.out.println("*******");
		ArrayList<Employee> r4 = new ArrayList<Employee>();
		r4.add(emp1);
		r4.add(emp2);
		r4.add(emp3);
		//System.out.println(emp.age+emp.age+"\n");
	//iterator to traverse the values // we need while loop for iterator because its not working on the basis of indexs
		Iterator<Employee> it = r4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.print(emp.name+"\n");
		  System.out.print(emp.age+"\n");
		System.out.print(emp.dept+"\n");
			
		}
		
		//addall()
		
		ArrayList<String> r5 = new ArrayList<String>();
		r5.add("selenium");
		r5.add("QTP");
		r5.add("test");
		
		ArrayList<String> r6 = new ArrayList<String>();
		r6.add("java");
		r6.add("exception");
		r6.add("udemy");
		 r5.addAll(r6);
		 System.out.println("*****");
		 for(int i = 0; i<r5.size(); ++i) {
			 System.out.println(r5.get(i));
			 	 }
		 //removeAll
		 r5.removeAll(r6);
		 
		 for(int i = 0; i<r5.size(); ++i) {
			 System.out.println(r5.get(i));
			;
		}
		 //retain all
			ArrayList<String> r7 = new ArrayList<String>();
			r7.add("selenium");
			r7.add("QTP");
			r7.add("test");
			
			ArrayList<String> r8 = new ArrayList<String>();
			r8.add("java");
			r8.add("exception");
			r8.add("test");
			 r7.retainAll(r8);
			
			 for(int i = 0; i<r7.size(); ++i) {
				 System.out.println(r7.get(i));
			}
	}
	}


