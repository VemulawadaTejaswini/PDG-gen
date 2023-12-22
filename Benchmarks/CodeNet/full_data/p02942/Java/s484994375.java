import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() { ;
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();

		int A[][] = new int[N + 1][M + 1];
		for(int i = 1 ; i <= N ; i ++) {
			for(int j = 1 ; j <= M ; j ++) {
				A[i][j] = sc.nextInt();
			}
		}
//		for(int i = 1 ; i <= N ; i ++) {
//			for(int j = 1 ; j <= M ; j ++) {
//				System.out.print("A[" + i + "][" + j + "]=" + A[i][j] + " ");
//			}
//			System.out.println();
//		}

		stepAll(N,M,A);
	}

	public void stepAll(int N, int M, int A[][]){
		int B[][] = new int[N + 1][M + 1];
		int C[][] = new int[N + 1][M + 1];
		for(int i = 1 ; i <= N ; i ++) {
			for(int j = 1 ; j <= M ; j ++) {

				//横に動く
				int num = A[i][j] ;
				//横位置を見つける
				int m = num % M;
				if(m==0) {
					m = M ;
				}
				//縦位置を求める
				int n = (num-1)/M + 1;

				if(B[i][m] == 0) {
					B[i][m] = num ;
					if(C[n][m] == 0) {
						C[n][m] = num ;
					}else {
						for(int k = 1; k <= N ; k ++) {
							if(C[n][k] == 0) {
								C[n][k] = num ;
								break ;
							}
						}
					}
				}else {
					for(int k = 1; k <= M ; k ++) {
						if(B[i][k] == 0 && C[n][k] == 0) {
							B[i][k] = num ;
							C[n][k] = num ;
							break ;
						}
					}
				}
			}
		}
		for(int i = 1 ; i <= N ; i ++) {
			for(int j = 1 ; j <= M ; j ++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}
		for(int i = 1 ; i <= N ; i ++) {
			for(int j = 1 ; j <= M ; j ++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
	}
}