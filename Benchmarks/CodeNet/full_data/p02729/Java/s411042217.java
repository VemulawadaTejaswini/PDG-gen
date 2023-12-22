import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = 0;

		String result = "";

		res = a*(a-1)+b*(b-1);
		res/= 2;


		System.out.printf("%d\n", res);
		//System.out.printf("%d", result);
	}
}
