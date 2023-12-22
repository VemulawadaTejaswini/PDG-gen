import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int x[] = new int[5];
		int y =1000009;
		int sum = 0;
		for (int n = 0; n < 5; n++) {
			x[n] = stdin.nextInt();
			if (x[n] % 10 != 0) {
				sum = sum + (x[n] / 10 + 1) * 10;
			} else {
				sum = sum + x[n];
			}
			if ((x[n] % 10) <= (y % 10)&&x[n]%10!=0) {
				y = x[n];
			}
		}
			sum = sum - (y / 10 + 1) * 10 + y;

		
		System.out.println(sum);

	}
}

