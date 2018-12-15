package arraysDataStructurePractice;

import java.lang.reflect.Array;

public class ArraysIntTwoD {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] ray = {
			{1, 2, 3},
			{3, 4, 5},
			{6, 7, 8},
			{9}
		};
				
		
		  
     
    	for (int i= 0; i < ray.length; i++) {
    for	 (int j = 0; j < ray[i].length; ++j) {
       
    	    //ray [i] [j] = (i*3); 
    	    //ray [i] [j] = (j*3);
    	  
    	    
    	   System.out.print(ray[i][j]);
    }
    		     System.out.println();
    		    
    		     int[] number = new int [100] ;
    		     for (int k= 0; k < 100; k++) {
    		      System.out.println(k);
    		     }
      
       }
	}
}


