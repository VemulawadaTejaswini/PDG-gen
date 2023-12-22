import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int w = sc.nextInt();
		for (int i=0;i<s.length();i+=w) {
			System.out.print(s.charAt(i));
		}
	}
}