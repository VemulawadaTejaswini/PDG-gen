import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();

		String a = S.substring(0, K-1);
		String b = S.substring(K-1, K).toLowerCase();
		String c = S.substring(K);
		System.out.println(a + b + c);
	}
}