import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n == 1) {
		    System.out.println(sc.nextInt());
		    return;
		}
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        right[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            left[i] = gcd(arr[i], left[i - 1]);
            right[n - i - 1] = gcd(arr[n - i - 1], right[n - i]);
        }
        int max = 1;
        for (int i = 1; i < n - 1; i++) {
            max = Math.max(max, gcd(left[i - 1], right[i + 1]));
        }
        max = Math.max(max, left[n - 2]);
        max = Math.max(max, right[1]);
		System.out.println(max);
	}
	
	static int gcd(int x, int y) {
	    if (x % y == 0) {
	        return y;
	    }
	    return gcd(y, x % y);
	}
}
