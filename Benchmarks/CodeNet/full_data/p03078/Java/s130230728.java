import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt(), K = sc.nextInt();
		Long[] A = new Long[X];
		Long[] B = new Long[Y];
		Long[] C = new Long[Z];
		Long[] AB = new Long[X * Y];

		for(int i = 0; i < X; i++) A[i] = sc.nextLong();
		for(int i = 0; i < Y; i++) B[i] = sc.nextLong();
		for(int i = 0; i < Z; i++) C[i] = sc.nextLong();
		Arrays.sort(C);

		for(int i = 0; i < X; i ++) {
			for(int j = 0; j < Y; j++) {
				AB[i * Y + j] = A[i] + B[j];
			}
		}
		Arrays.sort(AB);

		PriorityQueue<Long> que = new PriorityQueue<Long>();
		for(int i = 0; i < Z; i++) {
			if(que.size() > K) {
				Long top = que.peek();
				if(top > AB[X * Y - 1] + C[Z - i - 1]) break;
			}
			for(int j = 0; j < X * Y; j++) que.add(AB[X * Y - j - 1] + C[Z - i - 1]);
		}
		long[] ans = new long[que.size()];
		int length = que.size();
		for(int i = 0; i < length; i++) {
			ans[i] = -que.poll();
		}
		Arrays.sort(ans);

		for(int i = 0; i < K; i++) System.out.println(-ans[i]);

	}
}