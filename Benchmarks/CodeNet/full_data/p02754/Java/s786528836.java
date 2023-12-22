import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long a = scanner.nextLong();
		long b = scanner.nextLong();

		long ans = 0;
		if(a + b > 0){
			long big = n/(a+b);
			long small = n%(a+b);
			long ss = Math.min(small, a);


			ans = big*a + ss;
		}

		System.out.println(ans);
	}

}
