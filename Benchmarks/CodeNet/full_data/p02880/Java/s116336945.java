import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		System.out.println(solve(n));
		in.close();
	}

	private static String solve(int n) {
		for (int a = 1; a < 10; a++)
			if (n % a == 0 && n / a < 10)
				return "Yes";
		return "No";
	}
}