import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		String c = scanner.next();
		String A = a.toUpperCase();
		String B = b.toUpperCase();
		String C = c.toUpperCase();
		System.out.printf("%c%c%c",A.charAt(0),B.charAt(0),C.charAt(0));
	}
}