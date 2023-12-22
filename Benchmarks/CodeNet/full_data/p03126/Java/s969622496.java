import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int[] result = new int[m];
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(sc.next());
			for (int j = 0; j < k; j++) {
				result[Integer.parseInt(sc.next()) - 1]++;
			}
		}
		int ans = 0;
		for (int i = 0; i < result.length; i++) {
			if (result[i] == n) {
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}