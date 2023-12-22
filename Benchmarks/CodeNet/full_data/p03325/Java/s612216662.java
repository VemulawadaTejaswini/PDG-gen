import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		long ans = 0;
		for(int i = 0; i < n; i++) {

			if(array[i] % 2 == 0) {
				if(ans == 0) ans = 1;
				ans *= 2;
			}
			else ans++;
		}
		ans--;
		if(ans-1 == n) ans = 0;
		System.out.println(ans);
	}
}
