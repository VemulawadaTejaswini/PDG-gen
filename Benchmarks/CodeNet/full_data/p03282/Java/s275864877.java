import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		long k = scan.nextLong();
		for(int i = 0; i < k; i++) {
			if(s.charAt(i) != '1') {
				System.out.println(s.charAt(i));
				return;
			}
		}
		System.out.println('1');
	}
}