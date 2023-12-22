import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		long sum = m * 1900 + (n - m) * 100;
		sum *= 1 << m;
		System.out.println(sum);
	}
}
