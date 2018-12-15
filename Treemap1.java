package arraysDataStructurePractice;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Treemap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> m1 = new TreeMap<>();
		 
	   m1.put(19, "Bangladesh");// it  maintains ascending order
	   m1.put(2, "India");
	   m1.put(3, "Australia");
	    m1.put(10, "lal");
	    System.out.println(m1.hashCode());
	    TreeMap m2 = new TreeMap();
	    m2.put(10, "lal");
	    
	 System.out.println(m2.hashCode());
	   // m1.put(4, null);
	    System.out.println(m1.get(19));
	    System.out.println(m1.entrySet());
	    System.out.println(m1.remove(2));
	    System.out.println(m1.ceilingKey(1000));
	    System.out.println(m1.equals(m2));
	    
	}

}
