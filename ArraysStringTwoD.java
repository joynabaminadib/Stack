package arraysDataStructurePractice;

public class ArraysStringTwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] [] ray = new String [] []{ //without putting new String [] [] only start from curly brace also work
			{"mike"," ","sultana"," ","bibiana"},
			{"shaheb"," ","barir"," ","boithok"},
			{"khana"," ","shaheb"," ","babu"   },
			{"merese"}
		};
				
		
		     //int length = ray.length;  // no need to define this 
     
    	for (int i= 0; i < ray.length; i++) {
    for	 (int j = 0; j < ray[i].length; ++j) {
       
    
    	   System.out.print(ray[i] [j]);
    }
    		     System.out.println();
     
       }
	}
}

