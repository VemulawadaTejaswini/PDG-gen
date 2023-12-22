import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		scan.close();
		
		String str2 = str1.replaceAll("[a-z]", "x");
		System.out.println(str2);
	}
}