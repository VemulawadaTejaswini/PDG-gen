import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		if (s.length() < 26 || s.substring(s.length()-1, s.length()).equals("a")) {
			for (int i = 'a'; i <= 'z'; i++) {
				int z = s.indexOf(i);
				if (z == -1) {
					s += (char) i;
					break;
				}
				if(i == 'z') {
					s = "-1";
				}
			}
			System.out.println(s);
		} else {
			char ch[] = s.toCharArray();
			char first = ch[0];
			char second = (char) (first + 1);

			for (int i = 1; i < s.length(); i++) {
				if (second == ch[i]) {
					second += 1;
					continue;
				} else {
					String ans = s.substring(0, i);
					ans += second;
					System.out.println(ans);
					break;
				}
			}

		}

	}

}
