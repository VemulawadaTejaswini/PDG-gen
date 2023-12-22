import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		scan.close();

		int l1, l2, l3;
		if(a - c >= 0) {
			l1 = a - c;
		}else {
			l1 = c - a;
		}
		if(b - c > 0) {
			l2 = b - c;
		}else {
			l2 = c - b;
		}
		if(a - b > 0) {
			l3 = a - b;
		}else {
			l3 = b - a;
		}
		if(l1 <= d) {
			System.out.println("Yes");
		}else {
			if(l2 <= d && l3 <= d) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}