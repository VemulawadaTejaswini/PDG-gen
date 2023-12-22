import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] Sa = S.toCharArray();
		if (Sa[2] == Sa[3] && Sa[4] == Sa[5]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
