import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		double N1 = sc.nextInt();
		double N2 = sc.nextInt();
		if ((N2 / N1) <= 1.0) {
			System.out.println(1);
		} else {
			System.out.println(((int) N2 / (int) N1) + 1);
		}
	}
}