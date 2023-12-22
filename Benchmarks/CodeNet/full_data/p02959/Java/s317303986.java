import java.util.*;

public class Main {
	private static final String TEST = "";
	Scanner sc;
	int N;
	int[] A;
	int[] B;
	
/*-------------
 * constructor
 */
	public Main() {
		sc = new Scanner(System.in);
	}
	public Main(String input) {
		sc = new Scanner(input);
	}
	
/*------------------
 * instance methods
 */
	void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	public void exec() throws Exception {
		// 読み込み
		N = sc.nextInt();
		A = new int[N+1];
		B = new int[N+1];
		for (int i = 0; i < N+1; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		
		// 処理 A[i] は上書きする
		int remainPower = 0;
		
		long destroyCnt = 0;
		for (int i = 0; i < N+1; i++) {
			// まず remainPower でやっつける
			if (A[i] < remainPower) remainPower = A[i];
			A[i] -= remainPower;
			destroyCnt += remainPower;
			// その上で勇者が戦う
			if (A[i] > B[i]) {
				// 魔物が多い。倒して力尽きる
				destroyCnt += B[i];
				remainPower = 0;
			} else {
				// 力があまる
				destroyCnt += A[i];
				remainPower = B[i] - A[i];
			}
		}
		out(destroyCnt);
	}
	
/*------
 * main
 */
	public static void main(String[] args) throws Exception {
		Main m = new Main();
		m.exec();
	}
}

	