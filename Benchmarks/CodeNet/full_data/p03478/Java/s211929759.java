import java.util.Scanner;

public class Main {

	public static void main(
			String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int allSum = 0;
		for (int i = 1; i <= n; i++) {
			String s = String.valueOf(i);
			int sum = 0;
			for (int j = 0; j < s.length(); j++) {
				sum += Integer.parseInt(String.valueOf(s.charAt(j)));
			}
			if (sum >= a && sum <= b) {
				allSum += i;
			}
		}
		System.out.println(allSum);
	}
}
