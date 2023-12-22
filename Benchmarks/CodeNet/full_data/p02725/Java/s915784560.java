import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			num = Math.min(Math.abs(k / 2 - num), num);
			sum += num;
		}
		System.out.println(sum);
	}
}
