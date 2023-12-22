import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a,b,c,d = 0;
		String hantei = "No";

		Scanner scan = new Scanner(System.in);
		a = Integer.parseInt(scan.next());
		b = Integer.parseInt(scan.next());
		c = Integer.parseInt(scan.next());
		d = Integer.parseInt(scan.next());

		if(-d <= a-c && a-c <= d) {
			hantei = "Yes";
		}

		if((a <= b && b <= c) || (c <= b && b <= a)) {
			if(-d <= a-b && a-b <=d) {
			hantei = "Yes";
			}

		}

		System.out.println(hantei);

	}
}
