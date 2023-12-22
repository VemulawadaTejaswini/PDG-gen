import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();

		int min = digitSum(k);
		for (int i = 1; i < 100000000 ; i++) {
			int num = digitSum(k * i);
			if (min > num) {
				min = num;
			}
		}
		System.out.println(min);
	}

	public static int digitSum(int k) {
		int sum = 0;
		while (k > 0) {
			sum += k % 10;
			k = k / 10;
		}
		return sum;
	}

}
