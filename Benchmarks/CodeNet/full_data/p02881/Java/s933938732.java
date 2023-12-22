import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		long n = in.nextLong();
		System.out.println(solve(n));
		in.close();
	}
 
	private static long solve(long n) {
		long r = (long) (Math.pow(n, 0.5) + 1);
		for (; r > 1; r--)
			if (n % r == 0)
				return n / r + r - 2;
		return n - 1;
	}
}