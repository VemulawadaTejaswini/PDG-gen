import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
//		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		long K = sc.nextLong();
		int Q = sc.nextInt();
		int A[] = new int[Q];

		getAnswer(N,K,Q) ;
		//System.out.println(ans);
	}

	public void getAnswer(int N, long K, int Q) {
		int point[] = new int[N];

		for(int i = 0 ; i < Q; i ++) {
			int A = sc.nextInt();
			point[A-1] += 1;
		}
		for(int i = 0 ; i < N ; i ++) {
			long ans = point[i] + K - Q ;
			if(ans > 0 ) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}


	}


}
