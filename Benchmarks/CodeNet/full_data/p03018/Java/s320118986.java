import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		String s = st.nextLine();
		String copy = s.replace("BC", "X");
		long cou = 0;
		long ans = 0;
		for (int i = 0; i < copy.length(); i++) {
			char a = copy.charAt(i);
			if (a == 'A') {
				cou++;
			} else if (a == 'X') {
				ans += cou;
			} else {
				cou = 0;
			}
		}
		System.out.println(ans);
	}
}
