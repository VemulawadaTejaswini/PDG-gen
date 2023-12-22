import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();

		String S1 = s1.toUpperCase();
		String S2 = s2.toUpperCase();
		String S3 = s3.toUpperCase();

		System.out.print(S1.charAt(0));
		System.out.print(S2.charAt(0));
		System.out.print(S3.charAt(0));
	}

}
