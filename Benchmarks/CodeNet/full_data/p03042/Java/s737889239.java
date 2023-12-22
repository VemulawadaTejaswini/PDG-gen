import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		String a = S.substring(0, 2);
		String b = S.substring(2, 4);
		
		int A = Integer.parseInt(a);
		int B = Integer.parseInt(b);
		
		if(1 <= B && B <= 12) {
			if(1 <= A && A <= 12) {
				System.out.println("AMBIGUOUS");
			} else {
				System.out.println("YYMM");
			}
		} else if(1 <= A && A <= 12) {
			if(1 <= B && B <= 12) {
				System.out.println("AMBIGUOUS");
			} else if(B != 0) {
				System.out.println("MMYY");
			} else {
				System.out.println("NA");
			}
		} else {
			System.out.println("NA");
		}
		
	}
}
