import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length();
		System.out.print(s.charAt(0));
		System.out.print(len-2);
		System.out.println(s.charAt(len-1));
		
		sc.close();
	}
}