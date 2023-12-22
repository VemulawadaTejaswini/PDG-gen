import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		for (int i = 0; i < c ; i++) {
			if (a > 0) {
				a--;
			} else if (b > 0) {
				b--;
			}
		}

		System.out.println(a + " " + b);
	}

}