import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		String s1 = s.substring(0, k-1);
		String s2 = s.substring(k-1, k);
		String s3 = s.substring(k, n);
		s2 = s2.toLowerCase();
		
		System.out.println(s1 + s2 + s3);
	
	}
}