import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] d = new int[n];
		for (int i = 0;i < n;i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		d[0] = a[0];
		for (int i = 1;i < n;i++) d[i] = a[i] + d[i-1];
		int ret = 1;
		for (int i = n-2;i >= 0;i--) {
			if (d[i]*2>=a[i+1]) {
				ret++;
			} else {
				break;
			}
		}
		System.out.println(ret);
	}
}