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
		int X = sc.nextInt();
		int L[] = new int[N+2] ;
		for(int i = 1 ; i <= N ; i ++) {
			L[i] = sc.nextInt();
		}

		int D[] = new int[N+2] ;
		D[1] = 0 ;
		int ans = 2 ;
		for(int i = 2 ; i <= N + 1 ; i ++) {
			D[i] = D[i - 1] + L[i - 1];
			if(D[i] > X) {
				break;
			}
			ans = i ;
		}

		System.out.println(ans);
	}

}
