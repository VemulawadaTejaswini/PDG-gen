import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];

		for(int i = 0 ; i < n ; i++) {
			p[i] = sc.nextInt();
		}

		int ans = 0;
		for(int i = 1 ; i < n - 1 ; i++) {
			if((p[i] <= p[i + 1] && p[i] >= p[i - 1]) || (p[i] >= p[i + 1] && p[i] <= p[i - 1])) {
				ans++;
			}
		}
		System.out.println(ans);

		sc.close();

	}

}
