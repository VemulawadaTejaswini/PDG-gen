import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split("");
		String before = "";
		for (String s : in) {
			if (before.equals("h")) {
				if (s.equals("i")) {
					System.out.println("Yes");
					return;
				}
			}
			before = s;
		}
		System.out.println("No");
	}
}
