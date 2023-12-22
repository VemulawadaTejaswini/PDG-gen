import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int  N = sc.nextInt();
		Long A[] = new Long[N+2] ;
		Long B[] = new Long[N+1] ;

		for( int i = 1 ; i <= N + 1; i ++ ) {
			A[i] = sc.nextLong();
		}
		for( int i = 1 ; i <= N ; i ++ ) {
			B[i] = sc.nextLong();
		}

		//
		Long yoryoku = 0L ;
		Long mCountSum = 0L ;
		for( int i = 1 ; i <= N ; i ++ ) {
			Long mCount = 0L ;//モンスターを倒してもらえる人数
			if(yoryoku <= A[i]) {//余力より多い場合
				mCount =  yoryoku ;//まず余力分を倒す
				Long nokori = A[i] - yoryoku ;//残りのモンスター数
				if(nokori <= B[i]) {//残りを倒せるなら
					mCount = A[i] ;//全滅させる
					yoryoku = B[i] - nokori ; //余力を更新
				}else {//倒せないなら倒せるだけ
					mCount += B[i] ;
					yoryoku = 0L ;
				}
			}else {//余力より少ないモンスターなら
				mCount = A[i] ; //全滅させる
				yoryoku = B[i] ; //すべてを余力にする
			}
			mCountSum += mCount ;
		}
		//最後の町
		if(0 < yoryoku) {
			if(yoryoku <= A[N+1]) {//余力より多い場合
				mCountSum += yoryoku ;
			}else {
				mCountSum += A[N+1] ; //全滅させる
			}
		}


		System.out.println(mCountSum);
	}
}
