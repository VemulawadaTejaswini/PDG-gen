import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String x = "";

		char[] c = new char[2];
		c[0] = s.next().charAt(0);
		c[1] = s.next().charAt(0);

		if(c[0] == c[1]) {
			System.out.println('H');
		} else {
			System.out.println('D');
		}

	}
}