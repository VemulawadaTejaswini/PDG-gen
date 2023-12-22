import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N + 1];
		int[] SX = new int[N + 1];
		
		for (int i = 1; i <= N; i++) {
			X[i] = SX[i] = sc.nextInt();
		}
		
		Arrays.sort(SX);
		
		int mi = N / 2;
		for (int i = 1; i <= N; i++) {
			if (X[i] > SX[mi]) {
				System.out.println(SX[mi]);
			} else {
				System.out.println(SX[mi + 1]);
			}
		}
	}
}
