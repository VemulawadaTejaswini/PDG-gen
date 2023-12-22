import java.util.Scanner;

// https://atcoder.jp/contests/abc161/tasks/abc161_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		sc.close();

		long[] ansArray =  {n,n,n};

		n = n%k;
		long ans = n;
		long ans1 = n;
		long ans2 = n;
		while(true) {
			ansArray[2] = Math.abs(ansArray[1] - k);

			ans = Math.abs(ans - k);
			ans1 = Math.abs(ans - k);
			ans2 = Math.abs(ans1 - k);

			if(ans==ans2) {
				System.out.println(Math.min(ans1, ans2));
				return;
			}
		}


	}
}
