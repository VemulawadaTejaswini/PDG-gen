import java.util.*;
import java.util.stream.*;

/**
 * LIS(Longest increasing subsequence) を用いた解法
 */
public class Main {
	Scanner sc;
	int N;
	int[] a;
	int[] lenTable; // 広義単調減少列の各長さでの右端最大値 table
	int len; // lenTable の -1 でない数
	
//=============
// constructor
//
	public Main() {
		sc = new Scanner(System.in);
	}
	
//==================
// instance methods
//
	private void input() {
		N = sc.nextInt();
		a = new int[N];
		IntStream.range(0, N).forEach(i -> a[i]=sc.nextInt());
		lenTable = new int[N+1]; // [0] は使わない
		Arrays.fill(lenTable, -1);
		len = 0;
	}
	
	private void output() {
			out(len);
	}
	
	private void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	/**
	 * 計算本体
	 */
	private void calc() {
		for (int i = 0; i < N; i++) {
			int v = a[i];
			// v を用いて lenTable を更新する
			updateLenTable(v);
		}
	}

	/**
	 * 数列の右に newValue を追加した場合、lenTable を更新する。
	 * 
	 * @param newValue 数列の右に追加する数
	 */
	private void updateLenTable(int newValue) {
		// newValue より真に小さい最初の index を探す
		// newValue-0.5 の入る位置を探す
		int left = 1;
		int right = len+1; // 必ず -1 のところにする
		while (left <= right) {
			int mid = (left + right) / 2;
			int mval = lenTable[mid];
			
			if (mval > newValue-0.5) {
				left = mid + 1;
			} else if (mval < newValue-0.5) {
				right = mid - 1;
			} else {
				// ここにはこない
			}
		}
		if (lenTable[left] == -1) len++;
		lenTable[left] = newValue;
	}
	
//======
// main
//
	public static void main(String[] args) throws Exception {
		Main m = new Main();
		m.input();
		m.calc();
		m.output();
	}
}
