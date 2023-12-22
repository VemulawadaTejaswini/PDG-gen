import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = n / 27;
		res = res * 25;

		int remain = n % 27;

		if (remain == 13 || remain == 26) {
			System.out.println(":(");
		} else if (remain < 13) {
			System.out.println(res + remain);
		} else {
			System.out.println(res = res + remain - 1);
		}
	}

}