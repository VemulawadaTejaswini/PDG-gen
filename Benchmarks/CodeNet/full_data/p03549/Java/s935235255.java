import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		System.out.println((long)((1900*M + 100*(N-M))*Math.pow(2, M)));
	}
}
