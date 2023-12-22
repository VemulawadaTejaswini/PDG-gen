import java.util.Scanner;

class Main {
	static int x;
	static int minI;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		boolean isHome = s.contains("N") == s.contains("S")
						&& s.contains("W") == s.contains("E");
		System.out.println(isHome ? "Yes" : "No");

		sc.close();
	}

}
