import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] H = new int[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		Arrays.sort(H);
		long sum = 0;
		for (int i = 0; i < H.length - K; i++) {
			sum += H[i];
		}
		System.out.print(sum);
	}
}