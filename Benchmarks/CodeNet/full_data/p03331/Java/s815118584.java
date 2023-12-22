import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= n / 2; i++) {
		    min = Math.min(min, getSum(i) + getSum(n - i));
		}
	    System.out.println(min);
	}
	
	static int getSum(int x) {
	    int sum = 0;
	    while (x > 0) {
	        sum += x % 10;
	        x /= 10;
	    }
	    return sum;
	}
}
	
