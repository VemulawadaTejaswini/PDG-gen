import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int min = N/K;
		int max = N/K + N%K;

		System.out.println( Math.abs(max - min) );
	}
}