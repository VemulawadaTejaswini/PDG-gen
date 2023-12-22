import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // int Nを受け取る
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt(); // int A[i]を受け取る
		}
		sc.close(); // 標準入力を終了

		int shift = 0; // 操作を行える回数
		boolean odd = false; // 奇数フラグ

		// 奇数が見つかるまで操作を繰り返す
		while(!odd) {
			for(int i = 0; i < N; i++) {
				if(A[i] % 2 != 0) {
					//奇数が見つかったら終了
					odd = true;
					break;
				}else {
					A[i] = A[i] / 2;
				}
			}
			// 奇数フラグが無ければshift+1
			if(!odd)shift += 1;
		}

		// shiftを出力
		System.out.println(shift);
	}

}