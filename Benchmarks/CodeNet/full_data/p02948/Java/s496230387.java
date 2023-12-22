import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] job = new int[N][2];
		for (int i = 0; i < N; i++) {
			job[i][0] = sc.nextInt();
			job[i][1] = sc.nextInt();
		}
		Arrays.sort(job, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
		int ans = 0;
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for (int i = M, j = 0; i >= 0; i--) {
			while (j < N && job[j][0] + i <= M) {
				q.offer(-job[j++][1]);
			}
			if (!q.isEmpty())
				ans -= q.poll();
		}
		System.out.println(ans);
	}
}