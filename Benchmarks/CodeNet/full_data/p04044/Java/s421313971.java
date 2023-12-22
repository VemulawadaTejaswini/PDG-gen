import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}

		for (int i = 0; i < n-1; i++) {
			for (int j = n-1; j > i; j--) {
				if (s[j].compareTo(s[j-1]) < 0) {
					String tmp = s[j];
					s[j] = s[j-1];
					s[j-1] = tmp;
				}
			}
		}
		String ans = "";
		for (String str : s) {
			ans += str;
		}
		System.out.println(ans);
	}
}
