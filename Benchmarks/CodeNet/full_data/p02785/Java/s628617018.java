import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] h = new long[n];
		Arrays.setAll(h, i -> sc.nextInt());
		
		long cnt = 0;
		for (int i = 0; i < n - k; i++) {
			cnt += h[i];
		}
		
		System.out.println(cnt);
	}
}
