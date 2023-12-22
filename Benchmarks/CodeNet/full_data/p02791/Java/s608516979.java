import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int min = Integer.MAX_VALUE;

		int count = 0;

		for (int i = 0; i < n; i++) {
			int p = sc.nextInt();
			if (p < min) {
				min = p;
				count++;
			}
		}

		print(count);
		sc.close();
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
