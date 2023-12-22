import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		int A = 0,B = 0,x = 0;

		A = sc.nextInt();
		B = sc.nextInt();
		x = B % A;

		if(x == 0) {
			System.out.println(A + B);
		}else {
			System.out.println(B - A);
		}
	}
}
