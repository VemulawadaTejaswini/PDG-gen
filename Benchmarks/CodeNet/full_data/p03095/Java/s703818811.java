import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();// -96
		int[] characters = new int[26];
		Arrays.fill(characters, 1);
		for (int i = 0; i < n; i++) {
			characters[(int)s.charAt(i) - 97]++;
		}
		long ans = 1;
		for (int i = 0; i < 26; i++) {
			ans *= characters[i];
		}
		ans--;
		System.out.println(ans);
	}
}