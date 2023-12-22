import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//変数//
		int N;		//町の数
		int T;		//売買できるリンゴの個数
		int max;	//Aの最大値
		int action;	//かかるコスト
		int min;	//価格差最小値
		
		int[] Adif;		//各町ごとの価格差
		int[] A;		//町ごとの価格
		
		Scanner scan = new Scanner(System.in);
		
		//入力//
		N = scan.nextInt();
		T = scan.nextInt();
		
		A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = scan.nextInt();
		}
		
		scan.close();
		
		//処理//
		//初期処理
		action = 0;
		
		//Aが降順になっていなければコストは２
		max = A[0];
		for( int j = 1; j < N; j++ ){
			if( max < A[j] ){
				action = 2;
			}
		}
		
		//Aが降順の場合任意アクションを使う必要がある
		if( action == 0 ){
			Adif = new int[N - 1];
			
			//各町ごとの価格差を計算
			for(int k = 0; k < (N - 1); k++){
				Adif[k] = A[k] - A[k + 1];
			}
			
			//初期処理
			min = Adif[0];
			
			//価格差が最小の部分を見つける
			for(int l = 1; l < (N - 1); l++){
				if( min > Adif[l] ){
					min = Adif[l];
				}
			}
			
			//コストを求める
			action = min + 1;
		}
		
		//結果//
		System.out.println(action);

	}

}
