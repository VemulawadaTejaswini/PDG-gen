import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int x = 1;
		for (int i = 2; i < n; i++) {
			if (i*i > n)
				break;
			x = i * i;
		}

		System.out.println(x);
	}
}