package AtCoder;
import java.io.*;


public class Main  {
	  
      public static void main(String[]args){
    	  BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
    	  String line;
    	  String [] array;
    	  array = line.split("");
    	
    	  int startNumber=0;
    	  int endNumber=0;
    	  int i;
    	  for (i=0; i<array.length; i++){
    		  if (array[i].equals("A")){
    			  startNumber = i;
    			  break;			  
    		  }
    	  }
    	  for (int j=i; j<array.length; j++){
    		  if (array[j].equals("Z")){
    			  endNumber = j;
    		  }
    	  }
    	 
    	  
    	  System.out.println(endNumber - startNumber + 1);
     	  
    		  
      }
}
