
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tmp = sc.nextLine().split(" ");
		int k = Integer.parseInt(tmp[1]);
		char[] s = sc.nextLine().toCharArray();
		sc.close();

		s[k-1] = (char)(s[k-1] - 'A' + 'a');
		for(char c: s) {
			System.out.print(c);
		}
		System.out.println();
	}
}
