import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//変数//
		int K;		//入力
		int S;		//入力
		int X;		//組１
		int Y;		//組２
		int Z;		//組３
		
		Scanner scan = new Scanner(System.in);
		
		//カウンター
		int groupCount = 0;		//出力
		
		//入力//
		K = scan.nextInt();
		S = scan.nextInt();
		
		scan.close();
		//処理//
		for(X = 0; X <= K; X++){
			for(Y = 0; Y <= K; Y++){
				for(Z = 0; Z <= K; Z++){
					//合計計算
					int sum = X + Y + Z;
					
					//判定
					if( sum == S ){
						groupCount++;
					}
				}
			}
		}
	
		//結果//
		System.out.println(groupCount);

	}

}
