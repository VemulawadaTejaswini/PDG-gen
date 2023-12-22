import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int sumWin = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'o')
				sumWin++;
		}

		String ans = sumWin + (15 - s.length()) >= 8 ? "YES" : "NO";
		System.out.println(ans);
		sc.close();
	}

}
