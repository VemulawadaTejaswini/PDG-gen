import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int k = sc1.nextInt();
		int ans = n/(k-1);

		if(k==2) {
			ans = n-1;
		}

		System.out.println(ans);

		sc1.close();
	}

}