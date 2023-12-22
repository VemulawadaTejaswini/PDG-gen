import java.util.*;

class Main {
	  static long mod=1_000_000_007;
  public static void main(String[] args) {
	  int flg = 0;
	  Scanner sc = new Scanner(System.in);
      String S = sc.next();
      for(int i=0;i<S.length();i++) {
    	  if(i%2==0) {
    		  if(S.substring(i, i+1).equals("L")) {
    			  flg=1;
    		  }
    	  } else {
    		  if(S.substring(i, i+1).equals("R")) {
    			  flg=1;
    		  }    		  
    	  }
      }
      if(flg==1) {
    	  System.out.println("No");    	  
      } else {
    	  System.out.println("Yes"); 
      }
      
  }
  
 
}