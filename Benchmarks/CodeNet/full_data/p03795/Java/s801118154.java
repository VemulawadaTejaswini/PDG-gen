import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = 800*N;
		int y = N/15;

		System.out.println(x-y);
	}
}