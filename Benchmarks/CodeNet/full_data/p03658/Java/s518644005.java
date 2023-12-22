import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] length = new int[N];

		int total = 0;
		for (int i = 0; i < N; i++) {
			length[i] = sc.nextInt();
		}
		Arrays.sort(length);

		int a = N - K;
		for (int i = a; i < N; i++) {
			total += length[i];
		}
		System.out.println(length);
	}
}