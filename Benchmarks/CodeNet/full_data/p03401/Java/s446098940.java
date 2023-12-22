import java.io.IOException;
import java.util.Scanner;
 
public class Main {
  /**
   * Main method.
   */
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    
    final int N = s.nextInt();

    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
    	int a_i = s.nextInt();
    	a[i] = a_i;   	
    }
    
    for (int i = 0; i < N; i++) {
    	int cost = 0;
    	int before_place = 0;
    	for (int j = 0; j <= N; j++) {
    		if (j == N) {
    			cost += Math.abs(0 - before_place);
    			break;
    		}
    		if (j == i) {
    			continue;
    		}
    		cost += Math.abs(a[j] - before_place);
    		before_place = a[j];
    	}
    	System.out.println(cost);
    }
 
  }
}