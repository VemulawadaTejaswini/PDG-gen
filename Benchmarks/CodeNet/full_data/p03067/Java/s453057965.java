import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		solve(a, b, c);

		in.close();

	}

	private static void solve(int a, int b, int c) {
		
		if((a <= c) && (c <= b)) {
			System.out.println("Yes");
			return;
		}
		
		if((b <= c) && (c <= a)) {
			System.out.println("Yes");
			return;
		}

		System.out.println("No");
	}

}