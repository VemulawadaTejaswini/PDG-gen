import java.util.Scanner;

public class Main {
	public static void mains(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(array[i] % 2 == 0) ans += 2;
			else ans++;
		}
		System.out.println(ans);
	}
}
