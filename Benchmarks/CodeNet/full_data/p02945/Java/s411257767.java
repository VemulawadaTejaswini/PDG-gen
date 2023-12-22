import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(solve(a, b));
	}

	private static int solve(int a, int b) {
		int r = a + b;
		if(a-b>r)
			r=a-b;
		if(a*b>r)
			r=a*b;
		return r;
	}
}
