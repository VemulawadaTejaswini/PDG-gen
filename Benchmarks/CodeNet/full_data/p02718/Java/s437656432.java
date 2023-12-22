import java.util.*;
import java.io.*;
 
public class Main {
    public static void main (final String[] args) {
        final Scanner s = new Scanner(System.in);
          int n = Integer.parseInt(s.next());
      	  int m = Integer.parseInt(s.next());
      	
      	int[] vote = new int[n];
      	int sum = 0;
      	for(int i = 0; i < n; i++) {
          vote[i] = Integer.parseInt(s.next());
          sum += vote[i];
        }
      	
      	Arrays.sort(vote);
      
      	if ((double)vote[n-m] >= (double)sum/(4*(double)m)) System.out.println("Yes");
      	else System.out.println("No");
    }
}