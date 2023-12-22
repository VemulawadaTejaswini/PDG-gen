import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt() + 1;
		int j = sc.nextInt();

		int k = ((j / i) + 1);

		if (k * i - k >= j) {
			System.out.println(k);
		} else {
			System.out.println(k * i - k);
		}
	}
}