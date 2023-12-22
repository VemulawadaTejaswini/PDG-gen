import java.util.Scanner;

// https://atcoder.jp/contests/abc144/tasks/abc144_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();

		for(long i=(long) Math.sqrt(N);i>=1;i--) {
			if(N%i==0) {
				System.out.println(i+N/i-2);
				break;
			}
		}
	}
}