import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		String t = sc.next();
		boolean b = false;
		for (int i = 0; i < s.length(); i++) {
			if ((s.substring(i) + s.substring(0, i)).equals(t)) {
				b = true;
				break;
			}
		}
		if (b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
