import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[26];
		Arrays.fill(arr, Integer.MAX_VALUE);
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			int[] tmp = new int[26];
			for (int j = 0; j < s.length(); j++) {
				tmp[s.charAt(j) - 'a']++;
			}
			for (int j = 0; j < 26; j++) {
				arr[j] = Math.min(arr[j], tmp[j]);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < arr[i]; j++) {
				sb.append((char)(i + 'a'));
			}
		}
		System.out.println(sb);
	}
}
