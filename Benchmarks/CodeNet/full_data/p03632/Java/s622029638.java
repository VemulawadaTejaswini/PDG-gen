import java.util.*;
public class Main {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = sc.nextInt();
      
      if(A<C) {
    	  if(B<D) {
    		  System.out.println(B-C);
    		  System.exit(0);
    	  }
    	  else if(B>D) {
    		  System.out.println(D-C);
    		  System.exit(0);
    	  }
    	  else if(B==D) {
    		  System.out.println(B-C);
    		  System.exit(0);
    	  }
      }
      
      else if(A>C) {
    	  if(B<D) {
    		  System.out.println(B-A);
    		  System.exit(0);
    	  }
    	  else if(B>D) {
    		  System.out.println(D-A);
    		  System.exit(0);
    	  }
    	  else if(B==D) {
    		  System.out.println(B-A);
    		  System.exit(0);
    	  }
      }
      
      else if(A==C) {
    	  if(B<D) {
    		  System.out.println(B-A);
    		  System.exit(0);
    	  }
    	  else if(B>D) {
    		  System.out.println(D-A);
    		  System.exit(0);
    	  }
    	  else if(B==D) {
    		  System.out.println(B-A);
    		  System.exit(0);
    	  }
    	  
      }
      
      
	}
}
