import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long l = in.nextInt();
		long r = in.nextInt();

		l = l % 2019;
		r = r % 2019;

		if(l >= r || (l * r) % 2019 == 0) {
			System.out.println(0);
			return;
		}

		long min = 2019;

		for(long i = l; i <= r-1; i++) {
			for(long j = i + 1; j <= r; j++) {

				long tmp = (i * j)%2019;
				min = (min < tmp) ? min : tmp;

			}
		}

		System.out.println(min);
	}
}
