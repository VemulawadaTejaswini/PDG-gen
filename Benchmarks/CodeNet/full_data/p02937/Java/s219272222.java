import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		BitSet[] ind = new BitSet[26];
		for (int i = 0; i < 26; i++)
			ind[i] = new BitSet();
		for (int i = 0; i < s.length(); i++)
			ind[s.charAt(i) - 'a'].set(i);
		for (int i = 0; i < t.length(); i++) {
			if (ind[t.charAt(i) - 'a'].isEmpty()) {
				System.out.println(-1);
				return;
			}
		}
		int k = 0, j = 0;
		long ans = 0;
		while (k < t.length()) {
			j = ind[t.charAt(k) - 'a'].nextSetBit(j);
			if (j < 0) {
				ans++;
				j = 0;
			} else {
				k++;
				j++;
			}
		}
		System.out.println(ans * s.length() + j);
	}
}