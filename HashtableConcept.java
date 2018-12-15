package arraysDataStructurePractice;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableConcept {
 static String t="7";
	public static void main(String[] args) {
		//it is similar to hashmap but its syncronised
		//stores the value on the basis of key-value
		//only one thread can accress thread safe
    Hashtable r9 = new Hashtable();
    
    r9.put("mike", "ke");// doesn't maintain order
    r9.put("selim", 10.56);
    r9.put(1000, true);  
    r9.put(89, 67);
    Hashtable r12 = new Hashtable();
    r12 = (Hashtable)r9.clone();
    System.out.println(r12);
    System.out.println(".........");
   if( r12.equals(r9)) {
    System.out.println("both equal");}
   else {System.out.println("nope");}
   r9.clear();
   System.out.println(r9);
    Map r111 = new HashMap(); //hashmap
    r111.put(1, "I");//hashmap
    r111.put(2, "Love");////hashmap
    r111.put(3, "my");//hashmap
    r111.put(4, "country");//hashmap
    r9.putAll(r111);//hashmap & hashtable
    r111.putAll(r9);//hashmap & hashtable
    System.out.println("r11+r9 value after put all: "+r111);//hashmap
    System.out.println("r11+r9 value after put all: "+r9);//hashmap & hashtable
    System.out.println();
    System.out.println(r9.keySet());
    System.out.println(r9.entrySet());
    System.out.println(r9.size());
    System.out.println(r9.get(67)); // in get if you want to get values you have to call by keys
    System.out.println(r9.get("mike"));
    Hashtable <Integer, String>r10 = new Hashtable();
   
    r10.put(1, "Eggs");
    r10.put(2, "Milk");
    
    r10.put(3, "Potatoes");
    r10.put(4, "Onions");
    r10.put(5, "Garlic");
    r10.put(6, "Ginger");//no null keys and null values but hashmap allows
    System.out.println(r10.size());
    System.out.println(r10.get(3));
    System.out.println(r10.containsKey(7));
    System.out.println(r10.remove(1));
    System.out.println("..;..;..;..;");
    Enumeration e = r10.elements(); //Enumeration work like Iterator
    while (e.hasMoreElements()){
    	System.out.println(e.nextElement());
    }
    
  
    System.out.println("*************"); 
   r10.remove(2);
   System.out.println(r10.size());
   if(r10.containsValue("Onion")) {
	   System.out.println("Value is available");
   }
   else {
	   System.out.println("not available");
   }
    System.out.println(r10.hashCode());
	}

}
