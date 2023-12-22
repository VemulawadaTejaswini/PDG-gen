import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		double wSide = len/3;
		double tSide = len/3;
		double hSide = len/3;

		double result = wSide*tSide*hSide;

		System.out.print(result);
		sc.close();
	}
}