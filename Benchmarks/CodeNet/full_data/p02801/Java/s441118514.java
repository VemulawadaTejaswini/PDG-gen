import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		char c =(char) (str.charAt(0)+1);
		System.out.println(c);
	}
}