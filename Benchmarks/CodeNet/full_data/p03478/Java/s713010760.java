import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int allSum = 0;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = 0;
			for (int j = 1; j <= getDigit(i); j++) {
				sum += getNumOfKeta(i, j);
			}
			if (a <= sum && sum <= b) {
				System.out.println("yes!"+sum);
				allSum += i;
			}
		}
	}

	public static int getDigit(int x) {
		int count = 1;
		int temp = x;
		while(true) {
			temp /= 10;
			if (temp >= 1) {
				count++;
			} else {
				return count;
			}
		}
	}

	public static int getNumOfKeta(int x, int keta) {
		int num = 0;
		int ten = 1;
		for (int i = 0; i < keta; i++) {
			ten *= 10;
		}
		int temp = x % ten;
		num = temp / (ten / 10);
		return num;
	}

}
