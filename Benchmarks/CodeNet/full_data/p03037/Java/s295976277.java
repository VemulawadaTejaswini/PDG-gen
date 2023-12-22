import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L[] = new int[M];
		int R[] = new int[M];

		int OK[] = new int[N] ;
		for( int i = 0 ; i < N ; i ++ ) {
			OK[i] = 1 ;
		}

		for( int i = 0 ; i < M ; i ++ ) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
			for( int idx = 0 ; idx < L[i] -  1; idx ++ ) {
				OK[idx] = 0 ;
			}
			for( int idx = R[i] ; idx < N; idx ++ ) {
				OK[idx] = 0 ;
			}
		}
		int sum = 0 ;
		for( int i = 0 ; i < N ; i ++ ) {
			sum += OK[i];
		}
		System.out.println(sum);

		// 出力
//		System.out.println("N=" + N + ",M=" + M);
//		for( int i = 0 ; i < M ; i ++ ) {
//			System.out.println("L[" + (i +1)+ "]=" + L[i] + ",R[" + (i +1)+ "]" + R[i]);
//		}
	}

}
