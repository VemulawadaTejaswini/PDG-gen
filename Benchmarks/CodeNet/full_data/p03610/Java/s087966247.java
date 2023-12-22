
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		for(int i=0;i<s.length();i=i+2) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}

}