import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long time = 100 * (n - m) + 1900 * m;
		System.out.println(time * (1 << m));
	}
}
