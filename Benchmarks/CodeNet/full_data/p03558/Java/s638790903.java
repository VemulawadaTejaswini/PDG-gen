import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = Integer.parseInt(sc.next());

		if (k == 6)
			System.out.println("hoge");

		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= 10; i++) {
			int l = k * i;
			int sum = 0;
			while (l > 0) {
				sum += l % 10;
				l /= 10;
			}
			min = Math.min(min, sum);
		}
		System.out.println(min);
	}
}