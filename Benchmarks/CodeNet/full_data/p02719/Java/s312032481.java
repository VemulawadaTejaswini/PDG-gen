import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),K = sc.nextInt();
		int amari = N%K;
		int ans = Integer.max(amari, K-amari);
		System.out.println(ans);
	}

}