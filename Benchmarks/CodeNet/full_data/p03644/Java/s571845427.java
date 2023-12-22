import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s = sc.nextLine();
		int s = sc.nextInt();

		int n = 1;

		for (int i = 0; i >= 0; i++) {
			n = n * 2;
			if (n > s) {
				int nn = n / 2;
				System.out.println(nn);
				return;
			}
		}
	}
}