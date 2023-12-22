import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ans =0;
		
		while(N>0) {
			N /=K;
			ans++;
		}

		System.out.println(ans);

	}

}