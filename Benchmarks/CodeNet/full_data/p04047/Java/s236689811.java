import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[2*n];
		for(int i = 0; i < 2*n; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		long ans = 0L;
		for(int i = 0; i < 2*n; i+=2) {
			ans += num[i];
		}
		System.out.println(ans);
	}
}