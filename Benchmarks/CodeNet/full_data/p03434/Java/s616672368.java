import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		Arrays.setAll(a, i -> sc.nextInt());
		Arrays.sort(a);
		
		int Alice = 0;
		int Bob = 0;
		int turn = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (turn == 0) {
				Alice += a[i];
			} else {
				Bob += a[i];
			}
			turn ^= 1;
		}
		
		int ans = Alice - Bob;
		System.out.println(ans);

		sc.close();
	}

}
