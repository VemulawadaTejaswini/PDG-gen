import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long K = sc.nextLong();
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)!='1') {
				System.out.println(s.charAt(i));
				return;
			}
		}
	}
}