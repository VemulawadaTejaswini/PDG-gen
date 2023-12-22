import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double total = 0;
		for (int i = 1; i <= n; i++) {
		    int x = i;
		    double base = 1.0 / n;
		    while (x < k) {
		        x *= 2;
		        base /= 2;
		    }
		    total += base;
		}
		System.out.println(total);
   }
}
