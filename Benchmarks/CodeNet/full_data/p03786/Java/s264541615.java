import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Please name your class Main
public class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    		Scanner in = new Scanner(System.in);

	   int n = in.nextInt();
	   
	   List<Integer> l = new ArrayList<>();
	   
	   for(int i=0; i<n; i++) {
		   l.add(in.nextInt());
	   }
	    
	   
	   Collections.sort(l);
	   
	   long cur = 0;
	   int left = 0;
	   
	   for(int i=0; i<n-1; i++) {
		   
		   cur += l.get(i);
		   
		   if(cur * 2 < l.get(i+1)) {
			   left = i+1;
		   }
	   }
	   
	   System.out.println(n - left);
	}
}