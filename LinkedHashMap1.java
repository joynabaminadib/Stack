package arraysDataStructurePractice;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		 LinkedHashMap<Integer,String> m1 = new LinkedHashMap<Integer,String>();
		 
		   // m1.put(19, "Bangladesh");// it  maintain order
		    m1.put(3, "Australia");
		    LinkedHashMap<Integer,String> m2 = new LinkedHashMap<Integer,String>();
		    m2.put(3, "Australia");
		    System.out.println(m1.equals(m2));
		   // m1.put(1000, "kisuparina");
		   // m1.put(4, null);
		    System.out.println(m1.get(19));
		    System.out.println(m1.entrySet());
		    System.out.println(m1.remove(2));
	}

	
	

}
