import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	int N;
	int M;
	
	// a, work の添え字は１つずれたものを使う。
	// i.e. a[0] = a1, work[0] = w1 など。
	int[] a;
	int[] work;
	
	boolean test = false;
//=============
// constructor
//
	public Main() {
		sc = new Scanner(System.in);
	}
	
//==================
// instance methods
//
	void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	public void exec() throws Exception {
		input();
		calc();
		output();
	}
	
	private void input() {
		// データ入力
		N = sc.nextInt();
		a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
	}
	
	private void calc() {
		// 答えを入れていくワーク用領域
		work = new int[N];
		
		for (int i = N; i > 0; i--) {
			// i の約数の番号を work に xor していく
			update(i);
		}
		
		// work が答えとなる。
		M = (int)IntStream.of(work).filter(n -> n > 0).count();
	}
	
	private void output() {
		
		// 答え出力
		out(M);
		if (M > 0) {
			String result = IntStream.range(0, N)
								.filter(n -> work[n] != 0)
								.mapToObj(n -> String.valueOf(n+1))
								.collect(Collectors.joining(" "));
			out(result);
		}
		
//		String result2 = IntStream.of(work)
//							.mapToObj(n -> String.valueOf(n))
//							.collect(Collectors.joining(" "));
//		out(result2);
	}
	
	private void update(int i) {
		if (a[i-1] == 0) return;
		
		int r = (int)(Math.sqrt(i));
		
		for (int d = 1; d <= r; d++) {
			if (i%d != 0) continue;
			// d, i/d が約数
			work[i/d-1] ^= a[i-1];
			if (d == i/d) continue;
			work[d-1] ^= a[i-1];
		}
	}
	
	// ランダムに問題を作り、解いてみる
	private void test() {
		N = (int)(Math.random()*100000 + 100000);
		a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = (int)(Math.random() * 2);
		}
		System.out.println("N="+N);
		calc();
		
		// 検算
		for (int i = 0; i < N; i++) {
			int aa = 0;
			for (int j = 1; j <= N; j++) {
				int num = (i+1)*j;
				if (num > N) break;
				aa ^= a[num-1];
			}
			if (work[i] != aa) {
				System.out.printf("NG! i=%d, work.i=%d\r\n",(i+1), work[i]);
				IntStream.of(a).forEach(n -> System.out.print(n + " "));
				System.out.println();
				IntStream.of(work).forEach(n -> System.out.print(n + " "));
				System.out.println();
				final int ii = i+1;
				IntStream.range(1, N).map(n -> n*ii).filter(n -> n <= N).forEach(n -> System.out.print(a[n-1] + " "));
				System.out.println();
				IntStream.range(1, N).map(n -> n*ii).filter(n -> n <= N).forEach(n -> System.out.print(work[n-1] + " "));
				System.out.println();
				System.exit(-1);
			}
			//System.out.print(i+" ");
		}
	}
	
	
//======
// main
//
	public static void main(String[] args) throws Exception {
		Main m = new Main();
//		m.test();
		m.exec();
	}
}