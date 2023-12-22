import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double N = scan.nextInt();
		if (N == 1) {
			System.out.println(1);
		} else {
			double answer = Math.ceil(N / 2);
			System.out.println((int) answer);
		}
	}

}