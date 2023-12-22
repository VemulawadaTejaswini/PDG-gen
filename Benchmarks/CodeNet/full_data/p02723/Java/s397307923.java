import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if((char)s.charAt(2)==(char)s.charAt(3) && (char)s.charAt(4)==(char)s.charAt(5)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
