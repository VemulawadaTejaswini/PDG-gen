import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long n = Long.parseLong(sc.next());
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		long q = n / (a + b);
		long r = n % (a + b);
		long ans = (r == 0) ? a * q : (r < a) ? a * q + r : (a + 1) * q;
		System.out.println(ans);
	}

}
