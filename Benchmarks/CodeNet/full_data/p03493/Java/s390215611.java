import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String  s = scan.next();

		s = s.replaceAll("0","");

		System.out.print(s.length());
	}

}