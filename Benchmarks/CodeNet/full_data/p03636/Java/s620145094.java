import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int len = s.length();

		System.out.println(s.substring(0,1) + (len - 2) + s.substring(len - 1, len));


	}

}
