import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());

		int ans = (int) Math.pow(100, d) * n;

		System.out.println(ans);
	}
}
