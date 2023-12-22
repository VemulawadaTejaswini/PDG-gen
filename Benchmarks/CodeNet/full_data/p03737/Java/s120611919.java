import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		
		String S1 = s1.substring(0, 1).toUpperCase();
		String S2 = s2.substring(0, 1).toUpperCase();
		String S3 = s3.substring(0, 1).toUpperCase();
		
		System.out.println(S1 + S2 + S3);
		
	}
}
