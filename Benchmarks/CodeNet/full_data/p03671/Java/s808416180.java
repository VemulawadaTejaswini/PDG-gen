import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int A = a+b;
		int B = b+c;
		int C = c+a;

		int [] list = new int [] {A, B, C};
		int min =list[0];

		for (int i = 1; i < list.length; i++) {
			int M = list[i];
			if (M <= min) {
				min = M;
			}
		}
		System.out.println(min);
	}
}