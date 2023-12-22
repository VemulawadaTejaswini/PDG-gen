import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int start = s.length();
		int before = start;
		int after = 0;
		while (before != after) {
			before = s.length();
			s = s.replaceAll("01", "");
			s = s.replaceAll("10", "");
			after = s.length();
		}
		System.out.println(start - after);
	}
}
