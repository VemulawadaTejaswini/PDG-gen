import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		Long sum = n % 2 == 0 ? (1l + n) * (n / 2) : (1l + n) * (n / 2) + (n / 2 + 1);

		System.out.println(sum - n);
	}
}