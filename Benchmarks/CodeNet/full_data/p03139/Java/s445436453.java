import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int N = input.nextInt();
		int A = input.nextInt();
		int B = input.nextInt();

		int max = Math.min(A, B);
		int big = A;
		int small = B;
		if (big <= small) {
			big = B;
			small = A;
		}

		int min = Math.max(0, small - ( N - big ));

		System.out.println(max + " " + min);

	}

}
