import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int x = in.nextInt();
		int r = solve(x);
		System.out.println(r);
	}

	private static int solve(int x) {
		if (x == 2)
			return 2;
		int[] s = new int[10000];
		int sm = 1;
		s[0] = 2;
		for (int i = 3;; i++) {
			int j = 0;
			while (j < sm) {
				if (i % s[j] == 0)
					break;
				j++;
			}
			if (j == sm) {
				s[sm] = i;
				sm++;
				if (i >= x)
					return i;
			}
		}
	}
}