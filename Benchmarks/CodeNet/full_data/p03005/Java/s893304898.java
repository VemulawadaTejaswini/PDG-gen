
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ans = 0;
		if(K == 1) {
			ans = 0;
		}else {
			ans =  N - K;
		}

		System.out.println(ans);
		sc.close();
	}

}