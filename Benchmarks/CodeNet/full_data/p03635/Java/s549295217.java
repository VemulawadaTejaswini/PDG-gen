import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		int ans = (n - 1) * (m - 1);
		System.out.println(ans);
		sc.close();
	}
}