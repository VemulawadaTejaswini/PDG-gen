import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] A = new int[N];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int a = scn.nextInt();
			A[a - 1]++;
		}

		for (int i = 0; i < N; i++) {
			if (A[i] == 0)
				continue;
			map.put(i, A[i]);
		}

		int shurui = map.size();
		for (int i = 1; i <= N; i++) {
			if (i > shurui) {
				System.out.println(0);
				continue;
			}
			if(i == 1) {
				System.out.println(N);
				continue;
			}

			int ans = 0;
			PriorityQueue<Integer> PQ = new PriorityQueue<Integer>();// (数, 数値)
			setPQ(PQ, A);

			while (PQ.size() >= i) {
				int[] P = new int[i];
				for (int j = 0; j < i; j++) {
					P[j] = PQ.poll();
				}
				ans += P[i - 1];
				for (int j = 0; j < i; j++) {
					P[j] -= P[i - 1];
				}
				for(int j = 0;j < i;j++) {
					if(P[j]!=0) {
						PQ.add(P[j]);
					}
				}
			}
			System.out.println(ans);
		}

	}

	public static void setPQ(PriorityQueue<Integer> PQ, int[] A) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0)
				continue;
			PQ.add(A[i]);
		}

	}
}
