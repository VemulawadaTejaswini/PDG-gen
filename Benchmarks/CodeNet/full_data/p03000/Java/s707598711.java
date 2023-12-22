import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int h= 0;
		int result = 1;

		for (int i = 0; i< n; i++) {
			h += sc.nextInt();
			if (h <= x) {
				result += 1;
			} else {
				break;
			}
		}

		System.out.println(result);
	}

}
