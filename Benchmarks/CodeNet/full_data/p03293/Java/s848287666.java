import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		boolean flg = false;

		String[] str = a.split("");



		for (int i = 0; i < str.length; i++) {

			StringBuffer sb = new StringBuffer();

			sb.append(str[str.length-1]);

			for(int j = 0; j < str.length-1; j++ ) {

				sb.append(str[j]);
			}

			if (String.valueOf(sb).equals(b)) {
				flg = true;
				break;
			}

			str = String.valueOf(sb).split("");

		}

		if (flg) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
