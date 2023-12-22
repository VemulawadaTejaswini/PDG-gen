import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long l = sc.nextInt();
		long r = sc.nextInt();
		long min = 2018;
		for (long i = l; i <= r; i++) {
			if (i % 2019 == 0)
				min = 0;
		}
		for (long i = l; i < l+2020; i++) {
			if (min == 0)
				break;
			for (long j = i + 1; j <= l+2020; j++) {
				if (i * j % 2019 < min)
					min = i * j % 2019;
			}
		}

		
		for (long i = r; i >= l-2020; i--) {
			if (min == 0)
				break;
			for (long j = i -1; j>=-2020; j--) {
				if (i * j % 2019 < min)
					min = i * j % 2019;
			}
		
		System.out.println(min);
	}
}