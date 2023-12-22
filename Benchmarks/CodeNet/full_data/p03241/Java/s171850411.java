import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = 1;
		for (int i = 2; m / i >= n; i++) {
		    if (m % i == 0) {
		        max = i;
		        if (i >= n && m / i >= i) {
		            max = m / i;
		            break;
		        }
		    }
		}
		System.out.println(max);
    }
}

