import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		if (A>=B && A>=C) {
			System.out.println(A%2==0?"0":B*C);
		}
		else if (B>=A && B>=C) {
			System.out.println(B%2==0?"0":C*A);
		}
		else {
			System.out.println(C%2==0?"0":A*B);
		}
		sc.close();
	}

}
