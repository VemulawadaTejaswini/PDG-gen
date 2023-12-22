import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.next().split("");
		int res = input.length - 2;
		while (true) {
			for (int i = 0; i <= res / 2; i++) {
				if (!input[i].equals(input[res - i - 1])) {
					res -= 2;
					continue;
				}
			}
			System.out.println(res);
			System.exit(0);
		}
	}
}
