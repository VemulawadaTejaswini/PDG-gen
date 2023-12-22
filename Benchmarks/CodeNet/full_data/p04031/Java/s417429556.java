import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int B = 0; int A = 0;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			A += a;
			B += a*a;
		}
		float y = A;
		y = y/n;
		int Y = Math.round(y);
		System.out.println(B-2*Y*A+n*Y*Y);
		sc.close();

	}

}