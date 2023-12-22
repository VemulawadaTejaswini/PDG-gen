import java.util.Scanner;

public class Main {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);

		String[] s = new String[3];

		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}

		int cnt = 0;

		for (int i = 0; i < s.length; i++) {
			if("1".equals(s[i])) {
				cnt ++;
			}
		}
		System.out.println(cnt);
	}

}
