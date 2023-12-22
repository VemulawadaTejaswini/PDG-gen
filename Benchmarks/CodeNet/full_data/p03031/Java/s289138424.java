
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] S = new int[M][N+1];

		for(int i = 0 ; i < M ; i ++){
			int k = sc.nextInt();
			for(int j = 0 ; j < k ; j++){
				S[i][j] = sc.nextInt();
			}
		}

		int[] P = new int[M];
		for(int i = 0 ; i < M ; i++){
			P[i] = sc.nextInt();
		}
		sc.close();

		//スイッチパターンを2進数で表現
		int aans = (int)Math.pow(2, N);

		String denkyu;
		//スイッチオフを表現するために、桁埋め
		String ar = "%0" + N + "d";

		int count = 0;
		int a = 0;
		int ans = 0;
		for(int i = 0 ; i < aans ; i++){
			denkyu = String.format(ar ,Integer.parseInt(Integer.toBinaryString(i)));
			//System.out.println(denkyu);


			//各電球ごとのスイッチパターンを全探索
			for(int j = 0 ; j < M ; j++){
				for(int k = 0 ; k < N ; k++){
					if(S[j][k] ==0){
						break;
					}
					//System.out.println("S : " + S[j][k]);

					//スイッチオンの数を合計
					a += Integer.parseInt(String.valueOf(denkyu).substring(S[j][k]-1,S[j][k]));

					}
				//System.out.println("a : " + a);

				//2で割ったときの余りは適切か
				if(a%2 == P[j]){
					count++;
				}
				a = 0;
			}
			//System.out.println(count);
			//全電球が点灯するパターン(countがMになるパターン)は何個あるか
			if(count == M){
				ans++;
			}
			count = 0;
		}

		System.out.println(ans);
	}

}