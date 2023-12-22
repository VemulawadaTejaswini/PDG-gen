import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		int k = scan.nextInt();
		String result = "Yey!";

		if ((e-a) > k) {
			result = ":(";   //直接通信ができないアンテナの組が存在
		}
		System.out.println(result);
	}
}