import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = s.substring(0, 2);
		String s2 = s.substring(2, 4);
		int ss1 = Integer.valueOf(s1);
		int ss2 = Integer.valueOf(s2);
		sc.close();

		if (ss1 != 0 && ss2 != 0) {
			if (ss1 <= 12) {
				if (ss2 <= 12) {
					System.out.println("AMBIGUOUS");
				}
				else {
					System.out.println("MMYY");
				}
			}
			else {
				if(ss2<=12) {
					System.out.println("YYMM");
				}
				else {
					System.out.println("NA");
				}
			}
		}
		else {
			if(ss2!=0&&ss2<=12) {
				System.out.println("YYMM");
			}
			else if(ss1!=0&&ss1<=12) {
				System.out.println("MMYY");
			}
			else {
				System.out.println("NA");
			}
		}
	}
}
