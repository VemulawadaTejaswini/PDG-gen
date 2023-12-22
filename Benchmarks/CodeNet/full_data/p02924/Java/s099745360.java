import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();

		long sum = (long) (n*(n-1)*0.5);

		System.out.println(sum);
		return;
	}
}