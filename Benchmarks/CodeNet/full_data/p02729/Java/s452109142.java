import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int answer = (n * (n - 1) + m * (m - 1)) / 2;

		print(answer);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}
}
