import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String s = stdIn.nextLine();

		if (s.length() < 5) {
			System.out.println("No");;
		} else if (s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}