import java.util.*;
import java.io.*;

public class Main {

	public static void main (String[] args) {
	   InputReader in = new InputReader(System.in);
	   int n = in.readInt();
	   int a[] = new int[n]; 
	   int b[] = new int[n]; 
	   int asum[] = new int[n]; 
	   for(int i = 0; i<n; i++) {
		   a[i] = in.readInt();
		   if(i == 0) {
			   asum[i] = a[i]; 
			   continue;
		   }
		   asum[i] = asum[i-1] + a[i]; 
	   }
	   for(int i = 0; i<n; i++) {
		   b[i] = in.readInt();
	   }
	   int max = 0; 
	  for(int i = 0; i<n; i++) {
		  int sum = 0;
		 for(int j = i; j<n; j++) {
			 sum += b[j]; 
		 }
		max = Math.max(max, sum+asum[i]);
	  }
	  System.out.println(max);
	}
}