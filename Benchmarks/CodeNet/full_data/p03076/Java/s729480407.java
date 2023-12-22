import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int dish[] = new int[5];

		for(int i = 0; i < 5; i++) {
			dish[i] = scan.nextInt();
		}

		int sum = 0;
		int max = 0;

		for(int i = 0; i < 5; i++) {
			int d = (dish[i] + 9) / 10 * 10;
			sum += d;
			max = Math.max(max, d - dish[i]);
		}
		System.out.println(sum - max);
	}
}