import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
	
		if (s.charAt(5) == '0' && Character.getNumericValue(s.charAt(6)) < 5 ) {
			System.out.print("Heisei");
		} else {
			System.out.print("TBD");
		}
	}
}