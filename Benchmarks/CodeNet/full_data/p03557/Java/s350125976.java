import java.util.Scanner;

import java.util.*;	
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] parts = new int[3][N];
		long count = 0;
		long foundA=0;
		long foundB=0;
	    for(int i=0; i<3; i++) {
			for(int j = 0;j<N;j++){
	    		parts[i][j]=sc.nextInt();
	    	}
			 Arrays.sort(parts[i]);
	    }
	    for(int i = 0; i<N; i++) {
	    	  foundA = (long)Arrays.binarySearch(parts[0], parts[1][i]);
	    	  foundB = (long)Arrays.binarySearch(parts[2],parts[1][i]);
			
	    	  if(foundA>=0) {	 
	    			  if(foundB>=0) {
	    				  count+=(long)(foundA*(N-foundB-1));
	    			
	    			  }else if(foundB<0) {
	    				  count+=(long)(foundA*(N-(-(foundB+1))));

	    			  }	  
	    		  
	    	  }else if(foundA<0) {
	 			 
	    			  if(foundB>=0) {
	    				  count+=(long)((-(foundA+1))*(N-foundB-1));  
	    				 
	    			  }else if(foundB<0) {
	    		
	    				  count+=(long)((-(foundA+1))*(N-(-(foundB+1)))); 
	    				  
	    		     }
	    	      
	          }
	     }
	    System.out.println(count);
	}
}
