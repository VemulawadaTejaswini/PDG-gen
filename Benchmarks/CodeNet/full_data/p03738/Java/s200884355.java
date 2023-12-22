import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(),b = sc.nextDouble();

		String ans = "";

		if (a > b ) {
			ans = "GREATER";
		} else if (a < b) {
			ans = "LESS";
		} else {
			ans = "EQUAL";
		}

		System.out.println(ans);
	}

}