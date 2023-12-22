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
        int max = 0;
        for (int i = 0; i < n; i++) {
            int base = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (base == 0) {
                    base = arr[j];
                } else {
                    base = gcd(arr[j], base);
                }
                if (max >= base) {
                    break;
                }
            }
            max = Math.max(max, base);
        }
		System.out.println(max);
	}
	
	static int gcd(int x, int y) {
	    if (x % y == 0) {
	        return y;
	    }
	    return gcd(y, x % y);
	}
}
