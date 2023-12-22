import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		long sum = 0;
		for (int i = 1; i <= A; i++) {
			if (i % 15 >0 && i % 5 >0 && i % 3 >0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}