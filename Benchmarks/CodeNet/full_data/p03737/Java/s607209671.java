import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		String x = String.valueOf(a.charAt(0)) + String.valueOf(a.charAt(0)) + String.valueOf(a.charAt(0));

		System.out.println(x.toUpperCase());

		sc.close();

	}

}