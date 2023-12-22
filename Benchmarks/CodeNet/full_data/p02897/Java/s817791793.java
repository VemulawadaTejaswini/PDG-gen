import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double N = Integer.parseInt(scanner.nextLine());
		scanner.close();

		N = Integer.parseInt(args[0]);
		double v =  (N - (int) (N / 2)) / N;
		
		System.out.println("" + v);
	}
}
