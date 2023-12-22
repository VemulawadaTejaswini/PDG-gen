import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), ans = 0;
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		Arrays.sort(l);
		for (int i = n-1; i >= n-k; i--) {
			ans += l[i];
		}
		System.out.println(ans);
	}

}