import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();

		char[] c = n.toCharArray();
		for (int i = 0; i < n.length(); i++) {
			if (c[i] == '1')
				c[i] = '9';
			else
				c[i] = '1';

		}

		String s = String.valueOf(c);

		System.out.println(s);

	}
}