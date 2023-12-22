import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int K = sc.nextInt();
		if (K>=E-A) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}
}
