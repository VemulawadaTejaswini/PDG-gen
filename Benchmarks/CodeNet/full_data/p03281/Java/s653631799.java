import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = {105, 135, 165, 189, 195};
		for (int i = 0; i < a.length; i++) {
			if (n >= 195) {
				System.out.println(5);
				return;
			}
			if (n < a[i]) {
				System.out.println(i);
				return;
			}
		}
	}
}
