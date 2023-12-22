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
		String s = in.next();
		String t = in.next();
		String r = solve(s, t);
		System.out.println(r);
	}

	private static String solve(String s, String t) {
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			r = r.concat(s.substring(i, i + 1));
			r = r.concat(t.substring(i, i + 1));
		}
		return r;
	}
}