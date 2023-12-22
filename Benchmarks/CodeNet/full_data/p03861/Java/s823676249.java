import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		int counta = 0;
		int countb = 0;

		for (int i = 0; i <= b; i++) {
			if (i % x == 0) {
				countb++;
			}
		}
		for (int j = 0; j < a; j++) {
			if (j % x == 0) {
				counta++;
			}
		}
		System.out.println( countb-counta );
	}
}