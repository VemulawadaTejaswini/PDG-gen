import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();
		int ans = op.equals("+") ? a + b : a - b;
		System.out.println(ans);
		sc.close();
	}
}