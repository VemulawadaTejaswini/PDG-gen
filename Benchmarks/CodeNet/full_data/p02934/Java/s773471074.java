import java.util.Scanner;

public class Main {
	static int intN =0;
	static int sosuCnt =0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String[] v = sc.nextLine().split(" ");

		int intN = Integer.parseInt(n);

		double result = 0;
		for (int i = 0;i < v.length;i++) {

			result = result + 1.0 / Integer.parseInt(v[i]);

		}

		System.out.println(1 / result);
	}
}