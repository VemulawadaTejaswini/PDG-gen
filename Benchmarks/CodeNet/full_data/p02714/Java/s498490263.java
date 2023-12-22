import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		sc.close();
		System.out.println(GetRGBCnt(N, S));
	}
	// public static void main(String[] args) throws Exception {

	// 	// char t[] = {'G','R','B','R'};
	// 	// int r55 = GetRGBCnt2(t.length, t);

	// 	for(int i=0; ; i++){
	// 		char[] S = getRGB(i);
	// 		if(4000<S.length){
	// 			System.out.println("--Complite--");
	// 		}
	// 		System.out.println(S);

	// 		int r1 = GetRGBCnt(S.length, S);
	// 		int r2 = GetRGBCnt2(S.length, S);
	// 		if(r1 != r2){
	// 			System.out.println("--------NG---------");
	// 			System.out.println(S.length);
	// 			System.out.println(S);
	// 			System.out.println(r1);
	// 			System.out.println(r2);
	// 			throw new Exception();
	// 		}
	// 	}
	// }

	public static char[] getRGB(int N){
		String base3 = Integer.toString(N, 3);
		char[] c = base3.toCharArray();
		for(int i=0; i<c.length; i++){
			if(c[i]=='0'){c[i]='R';continue;};
			if(c[i]=='1'){c[i]='G';continue;};
			if(c[i]=='2'){c[i]='B';continue;};
		}
		return c;
	}

	public static long GetRGBCnt(int N, char[] S){
		// RGB個数をカウント
		int[] iRGB = {0, 0, 0, 0}; // RGB Count
		for(int i=0; i<N; i++){
			if('R'==S[i]) {iRGB[0]++; continue;}
			if('G'==S[i]) {iRGB[1]++; continue;}
			if('B'==S[i]) {iRGB[2]++; continue;}
			iRGB[3]++;
		}

		// RGBとなる組合せ数を計算
		long max = (long)iRGB[0] * (long)iRGB[1] * (long)iRGB[2];

		// 除外
		long jogai = 0;
		// 開始点を0から順に設定
		for(int pit=0; pit<N-2; pit++){
			// 間隔を1から順に設定し、開始点から同間隔の2点を設定
			for(int len=1; pit+len*2<N; len++){
				// 3点を取得
				int[] p = {0, 0, 0};
				p[0] = pit;
				p[1] = pit+len;
				p[2] = pit+len*2;
				// 3点の間隔が同じでRGBになっている場合は除外
				if(S[p[0]]!=S[p[1]] && S[p[0]]!=S[p[2]] && S[p[1]]!=S[p[2]]){
					jogai++;
				}
			}
		}
		return max - jogai;
	}

	public static int GetRGBCnt2(int N, char[] S){
		int cnt = 0;
		for(int i=0; i<N-2; i++){
			for(int j=i+1; j<N-1; j++){
				for(int k=j+1; k<N; k++){
					// RGB判定
					if(S[i]!=S[j] && S[i]!=S[k] && S[j]!=S[k]){
						if(j-i != k-j){
							cnt++;
						}
					}
				}
			}
		}
		return cnt;
	}
}