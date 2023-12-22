import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length() / 2;
		String half = s.substring(0, len);

		StringBuilder lSb = new StringBuilder(half);
		StringBuilder rSb = new StringBuilder(half);

		while (true) {
			rSb.delete(len - 2, len);
			rSb.insert(0, lSb.substring(len - 1));
			lSb.delete(len - 1, len);
			len--;
			if (lSb.toString().equals(rSb.toString())) {
				break;
			}
		}

		System.out.println(len * 2);

		sc.close();
	}
}