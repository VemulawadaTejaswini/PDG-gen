import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		System.out.println(solve(s));
		in.close();
	}

	private static int solve(String s) {
		int n = s.length() + 1;
		int[] a = new int[n];
		s = ">".concat(s).concat("<");
		int nt = 0;
		for (int i = 0; i < n; i++)
			if (s.charAt(i) == '>' && s.charAt(i + 1) == '<') {
				nt += setR(i, s, a);
				nt += setL(i, s, a);
			}
		return nt;
	}

	private static int setL(int p, String s, int[] a) {
		int nt = 0;
		for (int i = p - 1; i >= 0; i--)
			if (s.charAt(i) == '>') {
				a[i] = a[i + 1] + 1;
				nt += a[i];
			} else {
				a[i] = Math.max(a[i + 1], a[i - 1]) + 1;
				nt += a[i];
				break;
			}
		return nt;
	}

	private static int setR(int p, String s, int[] a) {
		int nt = 0;
		for (int i = p + 1; i < a.length; i++)
			if (s.charAt(i + 1) == '<') {
				a[i] = a[i - 1] + 1;
				nt += a[i];
			} else
				break;
		return nt;
	}
}