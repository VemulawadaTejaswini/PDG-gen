import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		sc.close();

		System.out.println(val.length() == 3 ? "ABC" : "ABD");
	}
}