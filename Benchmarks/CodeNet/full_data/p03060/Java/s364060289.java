import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int V[] = new int[N];
			for(int i = 0; i < N; i++) {
				V[i] = s.nextInt();
			}
			final int C[] = new int[N];
			for(int i = 0; i < N; i++) {
				C[i] = s.nextInt();
			}

			int ret = 0;
			for (int i = 0; i < N; i++) {
				if (V[i] > C[i]) {
					ret += V[i] - C[i];
				}
			}
			System.out.println(ret);
		}
	}
}
