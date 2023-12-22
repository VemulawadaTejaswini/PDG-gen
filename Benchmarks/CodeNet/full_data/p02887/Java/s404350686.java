import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
		String s = sc.next();

		for (char c = 'a'; c <= 'z'; c++)
			s = s.replaceAll(c + "+", c + "");
		System.out.println(s.length());
	}
}
