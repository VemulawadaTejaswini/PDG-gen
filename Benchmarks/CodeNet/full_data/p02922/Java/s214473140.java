import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int C = 1;
		int D = 0;

		while (B > C) {
			C += A - 1;
			D++;
		}
		System.out.println(D);
	}
}
