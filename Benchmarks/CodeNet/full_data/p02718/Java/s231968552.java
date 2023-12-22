import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		///////////////////////
		// データ入力
		///////////////////////
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N];
		int sum = 0;
		for(int i=0; i<A.length; i++){
			A[i] = sc.nextInt();
			sum += A[i];
		}
		sc.close();
		
		///////////////////////
		// 処理
		///////////////////////
		int kosu = 0;
		for(int i=0; i<A.length; i++){
			if( A[i] < sum/(4*M) ){
				continue;
			}
			kosu++;
		}


		///////////////////////
		// データ出力
		///////////////////////
		String ans = "Yes";
		if(kosu<M){
			ans = "No";
		}
		System.out.printf("%s\n", ans);
	}
}