import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextInt();
		System.out.println((N - (int)(N / 2)) / N);
		sc.close();
	}
}
