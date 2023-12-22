import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		///////////////////////////////
		// 入力
		///////////////////////////////
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		sc.close();

		///////////////////////////////
		// 処理
		///////////////////////////////

		// RGB個数をカウント
		int[] iRGB = {0, 0, 0}; // RGB Count
		for(int i=0; i<N; i++){
			if('R'==S[i]) iRGB[0]++;
			if('G'==S[i]) iRGB[1]++;
			if('B'==S[i]) iRGB[2]++;
		}

		// RGBとなる組合せ数を計算
		int max = iRGB[0] * iRGB[1] * iRGB[2];

		// 除外
		int jogai = 0;
		// 開始点を0から順に設定
		for(int pit=0; pit<S.length -2; pit++){
			// 間隔を1から順に設定し、開始点から同間隔の2点を設定
			for(int len=1; pit+len*2<S.length; len++){
				// 3点を取得
				int[] p = {0, 0, 0};
				p[0] = pit;
				p[1] = pit+len;
				p[2] = pit+len*2;
				// RGBになっている場合は除外
				if(S[p[0]]!=S[p[1]] && S[p[0]]!=S[p[2]] && S[p[1]]!=S[p[2]]){
					jogai++;
				}
			}
		}

		//////////////////////////////////////
		// 出力
		//////////////////////////////////////
		System.out.println(max-jogai);	
		
	}
}