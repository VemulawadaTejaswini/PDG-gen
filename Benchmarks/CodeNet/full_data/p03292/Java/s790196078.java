import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());

		int max = Math.max(Math.max(A, B), C);
		int min = Math.min(Math.min(A, B), C);
		System.out.println(max - min);
		sc.close();

	}
}