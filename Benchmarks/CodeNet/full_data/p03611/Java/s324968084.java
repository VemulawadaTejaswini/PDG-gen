import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		Arrays.setAll(a, i -> sc.nextInt());
		Arrays.sort(a);
		
		long max = 1;
		for (int i = a[0] - 1; i <= a[n - 1] + 1; i++) {
			int x = i;
			long cnt = Arrays.stream(a).filter(num -> Math.abs(x - num) <= 1).count();
			max = Math.max(max, cnt);
		}
		
		System.out.println(max);

	}
}
