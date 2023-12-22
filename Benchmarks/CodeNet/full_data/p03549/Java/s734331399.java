import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		int once = (n - m) * 100 + m * 1900;
		int ans = once * (int) Math.pow(2, m);

		System.out.println(ans);
		sc.close();
	}
}