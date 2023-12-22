import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		char[] ca = s.toCharArray();
		for (char c : ca) {
			System.out.print((char) (((c + n) - 65) % 26 + 65));
		}
	}
}