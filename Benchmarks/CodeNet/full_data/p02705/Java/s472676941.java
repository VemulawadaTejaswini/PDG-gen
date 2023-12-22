import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		double R = scanner.nextDouble();

		double answer = 2 * R * Math.PI;

		System.out.println(answer);

		scanner.close();

	}
}