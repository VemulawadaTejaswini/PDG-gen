import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		int a = in.nextInt();
		int b = in.nextInt();
		int t = in.nextInt();

		int result = solve(a, b, t);
		System.out.println(result);

		in.close();

	}
	
	public static int solve(int a, int b, int t) {
		int result = 0;
		
		result = (int)(t / a) * b;
		
		return result;
	}

}