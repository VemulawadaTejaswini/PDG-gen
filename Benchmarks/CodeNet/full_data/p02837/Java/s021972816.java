import java.util.Scanner;

public class Main {
	private static Integer N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		int[][] x = new int[N][];
		int[][] y = new int[N][];
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
			x[i] = new int[A[i]];
			y[i] = new int[A[i]];
			for(int j = 0; j < A[i]; j++) {
				x[i][j] = Integer.parseInt(sc.next());
				y[i][j] = Integer.parseInt(sc.next());
			}
		}
		sc.close();

		int res = 0;
		for(int bit = 0; bit < (1 << N); bit++) {
			if(judge(bit, A, x, y)) {
				int count = 0;
				for(int i = 0; i < N; i++) {
					if((bit & (1 << i)) != 0) count++;
				}
				res = Math.max(res, count);
			}
		}
		System.out.println(res);

	}

	//整数bitに対応する「決め打ち」が整合しているかどうか判定
	public static boolean judge(int bit, int[] A, int[][] x, int[][] y) {
		for(int i = 0; i < N; i++) {
			if((bit & (1 << i)) == 0) continue;
				for(int k = 0; k < A[i]; k++) {
					int a = x[i][k];
					int b = y[i][k];

					//a = 0なのに「正直者」ならダメ
					if(b == 0 && (bit & (1 << a)) != 0) return false;
					//b = 1なのに「不親切」ならダメ
					if(b == 1 && (bit & (1 << a)) == 0) return false;
				}
			}
		return true;
	}
}