import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long count = 1;
		long p = 1;
		for (int i = 1; i <= n; i++) {
			count = count * i % 1000000007;
		}
		System.out.println(count);
	}
}