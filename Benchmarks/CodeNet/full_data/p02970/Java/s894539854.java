import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n = sc.nextInt();
		int d = sc.nextInt();

		double x = 2 * d + 1;
		System.out.println((int)Math.ceil(n/x));
}}