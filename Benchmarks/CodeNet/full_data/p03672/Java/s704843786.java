import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		char[] c = s.toCharArray();
		int[] alph = new int[26];
		for (int i = 0; i < c.length; i++) {
			alph[c[i] - 'a']++;
		}
		String target = s;
		boolean isOk = false;
		for (int i = target.length() - 1; i >= 2; i--) {
			alph[target.charAt(target.length() - 1) - 'a']--;
			target = target.substring(0, target.length() - 1);
			for (int j = 0; j < alph.length; j++) {
				if (alph[j] % 2 != 0) {
					isOk = false;
					break;
				} else {
					isOk = true;
				}
			}
			if (isOk) {
				System.out.println(target.length());
				return;
			}
		}
	}
}