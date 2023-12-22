

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws java.lang.Exception {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      String input[] = br.readLine().split(" ");
	      long a = Long.parseLong(input[0]);
	      long b = Long.parseLong(input[1]);
	      long c = Long.parseLong(input[2]);
	      if(c < a || c < b) {
	    	  System.out.println("No");
	    	  return;
	      }
	      double eps = 1.0E-14;
	      double lhs = Math.sqrt((double)a) + Math.sqrt((double)b) + eps;
	      double rhs = Math.sqrt(c);
	      System.out.println((lhs < rhs)?"Yes":"No");
	}

}
