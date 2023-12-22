import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] m = new int[sc.nextInt()];

		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				int a = sc.nextInt();
				m[a - 1]++;
			}
		}
		System.out.println(Arrays.stream(m).filter(x -> x == n).count());
		sc.close();
	}
}
