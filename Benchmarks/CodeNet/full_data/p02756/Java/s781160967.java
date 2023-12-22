

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

		public static void main(String[] args) throws java.lang.Exception {
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      String s = br.readLine();
		      int q = Integer.parseInt(br.readLine());
		      while(q-->0) {
		    	  
		    	  String input[] = br.readLine().split(" ");
		    	  int t = Integer.parseInt(input[0]);
		    	  if(t == 1) {
		    		  StringBuilder res = new StringBuilder(s);
		    		  res.reverse();
		    		  s = res.toString();
		    	  }
		    	  if(t == 2) {
		    		  int f = Integer.parseInt(input[1]);
		    		  String c = input[2];
		    		  if( f == 1) {
		    			  s = c + s;
		    		  }
		    		  else
		    			  s = s + c;
		    	  }
		      }
		      System.out.println(s);
		}
}