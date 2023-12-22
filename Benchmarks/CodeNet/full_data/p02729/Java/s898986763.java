import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;
		if (n > 1) {
			count += (n * (n - 1)) / 2;
		}
		if (m > 1) {
			count += (m * (m - 1)) / 2;
		}
		System.out.println(count);
		sc.close();
	}

}