import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int cnt = 1;
		while (cnt * (2 * d + 1) < n) {
			cnt++;
		}
		System.out.println(cnt);
	}
}
