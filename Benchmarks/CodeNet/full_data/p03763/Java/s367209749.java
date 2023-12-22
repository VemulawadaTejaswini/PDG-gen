import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] counts = getCounts(sc.next().toCharArray());
		for (int i = 1; i < n; i++) {
			merge(counts, getCounts(sc.next().toCharArray()));
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < counts[i]; j++) {
				sb.append((char)(i + 'a'));
			}
		}
		System.out.println(sb);
	}
	
	static void merge(int[] base, int[] next) {
		for (int i = 0; i < base.length; i++) {
			base[i] = Math.min(base[i], next[i]);
		}
	}
	
	static  int[] getCounts(char[] arr) {
		int[] counts = new int[26];
		for (char c : arr) {
			counts[c - 'a']++;
		}
		return counts;
	}
}
