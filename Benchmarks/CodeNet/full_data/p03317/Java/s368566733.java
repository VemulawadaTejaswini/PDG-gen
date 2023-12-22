import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		int k = sc1.nextInt();
		int ans = (n-1)/(k-1);
		if((n-1)%(k-1) != 0) {
			ans++;
		}

		System.out.println(ans);

		sc1.close();
	}

}