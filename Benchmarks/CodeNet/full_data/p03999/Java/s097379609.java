import java.util.*;
import java.lang.*;

public class Main {
	static long sum;
	static String s;
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		n = s.length();
		sum = 0;
		dfs(0, 0, s, 0);
		System.out.println(sum);
	}
	static void dfs(int count, int len, String s, long su) {
		if (count == n - 1) {
			su += Long.valueOf(s);
			sum += su;
			return;
		}
		dfs(count + 1, len + 1, s, su);
		String kiri = s.substring(0, len + 1);
		long po = Long.valueOf(kiri);
		dfs(count + 1, 0, s.substring(len + 1), su + po);
	}
}