import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();
		String C = scan.next();
		char a = A.charAt(A.length()-1);
		char bf = B.charAt(0);
		char bl = B.charAt(B.length()-1);
		char c = C.charAt(0);
		if (a == bf && bl == c) {
			System.out.println("YES");			
		}else {
			System.out.println("NO");
		}
	}
}
