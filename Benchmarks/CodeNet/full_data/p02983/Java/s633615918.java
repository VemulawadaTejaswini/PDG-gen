import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int r = in.nextInt();

		l = l % 2019;
		r = r % 2019;

		if(l >= r || (l * r) % 2019 == 0) {
			System.out.println(0);
			return;
		}

		int min = 2019;

		for(int i = l; i <= r-1; i++) {
			for(int j = i + 1; j <= r; j++) {

				int tmp = (i * j)%2019;
				min = (min < tmp) ? min : tmp;

			}
		}

		System.out.println(min);
	}
}
