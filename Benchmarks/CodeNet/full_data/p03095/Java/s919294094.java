import java.util.*;

public class Main {
	static final long MOD = 1000000007L;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		long[] counts = new long[26];
		Arrays.fill(counts, 1);
		for (char c : arr) {
			counts[c - 'a']++;
		}
		long total = 1;
		for (long x : counts) {
			total *= x;
			total %= MOD;
		}
		total -= 1;
		System.out.println(total);
	}
}
