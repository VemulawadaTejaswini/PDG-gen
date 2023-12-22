import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		arr[0] = sc.nextInt();
		for (int i = 1; i <= n; i++) {
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int ans = arr[1] - arr[0];
		for (int i = 2; i <= n; i++) {
		    ans = gcd(ans, arr[i] - arr[0]);
		}
        System.out.println(ans);
	}
	
	static int gcd(int x, int y) {
	    if (x % y == 0) {
	        return y;
	    } else {
	        return gcd(y, x % y);
	    }
	}
}
