package arraysDataStructurePractice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		

		LinkedList <String> l1 = new LinkedList<String>();
		//add
		l1.add("test");
		l1.add("Mike");
		l1.add("victor");
		l1.add("karim");
		l1.add("selim");
		l1.add("mouri");
		System.out.println("content of linkedlist:"+ l1);
		//LinkedList <int, String> l1 = new LinkedList<int , String>();
		//addfirst
		l1.addFirst("10");
		//addlast
		l1.addLast("Thank you");
		System.out.println("content of linkedlist:"+ l1);
		System.out.println(l1.get(0));
		l1.set(5, "selim");
		System.out.println(l1.get(5));
		//remove first and last element
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);
		//how to print all the values of linked list
		//for loop
		for (int n= 0; n<l1.size(); n++) {
			System.out.println(l1.get(n));
			}
		//advance for loop
		System.out.println("***advance***");
		for (String m: l1) {
			System.out.println(m);
		}
		//iterator
		//System.out.println("***iterator***");
		Iterator t = l1.iterator();
		while (t.hasNext()) {
			System.out.println(t.next());
		}
		
		//while loop
		System.out.println("******");
		int o= 0;
		while ( o<l1.size()) {
			System.out.println(l1.get(o));
		  o++;
			}
		
	}

}
