import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int min = s.length();
		int max = 0;

		for(int i = 0; i < s.length(); i++) {
			if('A'==s.charAt(i)) {
				min = Math.min(min, i);
			}
			if('Z'==s.charAt(i)) {
				max = Math.max(max, i);
			}
		}
		System.out.println((max - min) + 1);

	}

}