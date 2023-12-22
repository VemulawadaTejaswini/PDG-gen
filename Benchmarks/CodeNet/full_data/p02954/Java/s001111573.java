import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int n = arr.length;
		int[] org = new int[n];
		Arrays.fill(org, 1);
		for (int i = 0; i < 100000; i++) {
			int[] next = new int[n];
			for (int j = 0; j < n; j++) {
				if (arr[j] == 'R') {
					next[j + 1] += org[j];
				} else {
					next[j - 1] += org[j];
				}
			}
			org = next;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				sb.append(" ");
			}
			sb.append(org[i]);
		}
		System.out.println(sb);
	}
}
