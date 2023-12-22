import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,K,Q;
		N = sc.nextInt();
		K = sc.nextInt();
		Q = sc.nextInt();
		long a[] = new long[N];
		for (int i=0;i<N;i++) {
			a[i] = sc.nextLong();
		}
		if (K+Q-1>=N) {
			Arrays.sort(a);
			System.out.println(a[Q-1]-a[0]);
		}
	}
}