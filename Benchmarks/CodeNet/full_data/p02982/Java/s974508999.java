import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");

		int N = Integer.parseInt(line[0]);
		int D = Integer.parseInt(line[1]);

		int[][] X = new int[N][D];
		for (int i = 0; i < N; i++) {
			X[i] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();
		}

		long cnt = 0;
		double dist = 0;
		int yk, zk;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (i == j) continue;
				dist = 0;
				for (int k = 0; k < D; k++) {
					yk = X[i][k];
					zk = X[j][k];
					dist += Math.pow(yk - zk, 2);
				}
				dist = Math.sqrt(dist);
				if ((int) dist == dist) cnt++;
			}
		}
		System.out.println(cnt);
	}
}