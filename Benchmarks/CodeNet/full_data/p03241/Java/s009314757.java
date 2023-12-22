import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = 1;
		for (int i = 2; i <= Math.sqrt(m); i++) {
		    if (m % i == 0) {
		        if (m / i >= n) {
		            max = Math.max(max, i);
		        }
		        if (i >= n) {
		            max = Math.max(max, m / i);
		        }
		    }
		}
		System.out.println(max);
    }
}

