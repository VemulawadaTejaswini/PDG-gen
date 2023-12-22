import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int sum = 0;
		if( (a/2) >= c && (b/2) >= c) {
			int max = x > y ? x : y;
			sum += max * c * 2;
		} else if( (a+b) > (c * 2)) {
			if(x < y) {
				sum += x * c * 2;
				sum += (y - x) * a;
			} else {
				sum += y * c * 2;
				sum += (x - y) * a;
			}

		} else {
			sum += (a * x);
			sum += (b * y);
		}

		System.out.print(sum);
	}
}
