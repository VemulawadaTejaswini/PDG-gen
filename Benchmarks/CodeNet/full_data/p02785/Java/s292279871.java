import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] h = new int[n];

		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		Arrays.sort(h);

		long answer = 0;
		for (int i = 0; i < n - k; i++) {
			answer = answer + h[i];
		}

		print(answer);
		sc.close();
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
