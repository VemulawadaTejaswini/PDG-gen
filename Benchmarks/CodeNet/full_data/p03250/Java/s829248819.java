import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		int max = 0;
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
			max = Math.max(max, a[i]);
		}
		int money = sum + max * 9;
		System.out.println(money);
	}
}
