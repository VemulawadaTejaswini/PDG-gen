import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int A = scan.nextInt();
		 int B = scan.nextInt();

		 int max = -9999;
		 max = A+B > max ? A+B : max;
		 max = A-B > max ? A-B : max;
		 max = A*B > max ? A*B : max;
		 System.out.println(max);
	}
}
