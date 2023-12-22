import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//int N = Integer.parseInt(sc.nextLine());
		int N = sc.nextInt();
		int n = N % 2;
		int m = N / 2;

		if (n == 0) {
			System.out.println(m);
		} else {
			System.out.println(m + 1);
		}
	}
}
