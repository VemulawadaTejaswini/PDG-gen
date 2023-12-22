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
		for(int i=0; i<S.length; i++){
			if('R'==S[i]) iRGB[0]++;
			if('G'==S[i]) iRGB[1]++;
			if('B'==S[i]) iRGB[2]++;
		}

		// 最大組み合わせ個数
		int max = iRGB[0] * iRGB[1] * iRGB[2];

		// 除外
		int jogai = 0;
		// 開始点の選択
		int[] point = {0, 0, 0};
		for(int pit=0; pit<S.length -2; pit++){
			point[0] = pit;
			// 間隔の選択
			for(int len=1; pit+len*2<S.length; len++){
				point[1] = pit+len;
				point[2] = pit+len*2;
				if(S[point[0]]!=S[point[1]] && S[point[0]]!=S[point[2]] && S[point[1]]!=S[point[2]]){
					jogai++;
				}
			}
		}

		// 出力
		System.out.println(max-jogai);	
		
	}
}