import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong() - i - 1;
		}
 
		java.util.Arrays.sort(a);
 
		long b = a[n / 2];
 
		long result = 0;
		for (int i = 0; i < n; i++) {
			result += Math.abs(a[i] - b);
		}
		System.out.println(result);
	}
}