import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//1行目の入力
		int N = sc.nextInt();
		int K = sc.nextInt();
		//2行目以降の入力
		int[] C = new int[N];
		for(int i=0; i<N; i++){
			C[i]  = sc.nextInt();
		}

		//前からi枚目までを使った時に総和をjにできるか
		boolean[][] dp1 = new boolean[N+1][K+1];
		dp1[0][0] = true;
		for(int j=1; j<=K; j++){
			dp1[0][j] = false;
		}
		for(int i=1; i<=N; i++){
			dp1[i][0] = true;
		}
		for(int i=1; i<=N; i++){
			for(int j=1; j<=K; j++){
				if(dp1[i-1][j]==true){dp1[i][j]=true;}
				if(j-C[i-1]>=0){
					if(dp1[i-1][j-C[i-1]]==true){dp1[i][j]=true;}
				}
				else{dp1[i][j]=false;}
			}
		}

		//後ろからi枚目までを使った時に総和をjにできるか
		boolean[][] dp2 = new boolean[N+1][K+1];
		dp2[0][0] = true;
		for(int j=1; j<=K; j++){
			dp2[0][j] = false;
		}
		for(int i=1; i<=N; i++){
			dp2[i][0] = true;
		}
		for(int i=1; i<=N; i++){
			for(int j=1; j<=K; j++){
				if(dp2[i-1][j]==true){dp2[i][j]=true;}
				if(j-C[N-i]>=0){
					if(dp2[i-1][j-C[N-i]]==true){dp2[i][j]=true;}
				}
				else{dp2[i][j]=false;}
			}
		}

		//「カードiを含んだ総和がK-C[i-1]以上K未満のものをつくれるiの個数」を数える
		int count = 0;
		for(int i=1; i<=N; i++){
			outside: for(int j=K-C[i-1]; j<K; j++){
				for(int l=0; l<=j; l++){
					if(dp1[i-1][l]==true && dp2[N-i][j-l] == true){
						count++;
						break outside;
					}
				}
			}
		}
		System.out.println(N-count);

	}

}
