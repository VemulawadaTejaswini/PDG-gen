import java.util.Scanner;

public class Main {
//java11
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		long ans = 0;
		for(int i=0; i<N; i++) {
			if(i % 3 != 0 && i % 5 != 0) {
				ans += i;
			}
		}

		System.out.println(ans);
	}

}
