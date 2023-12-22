import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int o = 2 * n + 2 * (m - 2);
		System.out.println(Math.abs(n * m - o));
	}
}