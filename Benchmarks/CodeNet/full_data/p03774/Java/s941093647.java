import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[][] stu = new long[N][];
		for (int i = 0; i < N; i++) {
			stu[i] = new long[]{sc.nextInt(), sc.nextInt()};
		}
		long[][] p = new long[M][];
		for (int i = 0; i < M; i++) {
			p[i] = new long[]{sc.nextInt(), sc.nextInt()};
		}
		for (int i = 0; i < N; i++) {
			int ans = 0;
			for (int j = 1; j < M; j++) {
				if (Math.abs(stu[i][0] - p[j][0]) + Math.abs(stu[i][1] - p[j][1]) <
					Math.abs(stu[i][0] - p[ans][0]) + Math.abs(stu[i][1] - p[ans][1])) {
					ans = j;
				}
			}
			System.out.println(ans + 1);
		}
	}
}
