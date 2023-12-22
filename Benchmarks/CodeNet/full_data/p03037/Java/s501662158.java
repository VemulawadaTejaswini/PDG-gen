import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		int min = 0;
		int max = 100001;

		for(int i = 0; i < m; i++) {
			min = Math.max(min, scan.nextInt());
			max = Math.min(max, scan.nextInt());
		}

		System.out.println(Math.max(max - min + 1, 0));
	}
}