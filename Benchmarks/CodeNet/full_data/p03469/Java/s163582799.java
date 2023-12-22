import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] c = new char[2];
		c[0] = s.charAt(s.length()-2);
		c[1] = s.charAt(s.length()-1);
		String r = new String(c);
		System.out.println("2018/01/"+r);
	}
}
