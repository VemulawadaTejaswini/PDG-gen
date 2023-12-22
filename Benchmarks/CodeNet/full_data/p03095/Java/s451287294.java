import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();

		int[] l = new int[26];

		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			l[c - 'a']++;
		}

		int ans = 1;
		for (int i = 0; i < l.length; i++) {
			ans *= (l[i] + 1);
		}

		ans--;
		ans %= 1_000_000_000 + 7;

		System.out.println(ans);

		sc.close();
	}

}
