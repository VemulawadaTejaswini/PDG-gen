
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x_count = sc.nextInt();
		int y_count = sc.nextInt();

		long[] x_lines = new long[x_count];
		long[] y_lines = new long[y_count];


		for(int i = 0;i < x_count;i++){
			x_lines[i] = sc.nextLong();
		}
		for(int i = 0;i < y_count;i++){
			y_lines[i] = sc.nextLong();
		}

		long x_sum = 0,y_sum = 0;

		for(int i = 0;i < x_count;i++){
			int k = i + 1;
			x_sum += (k - 1) * x_lines[i] - (x_count - k) * x_lines[i];
		}
		for(int i = 0;i < y_count;i++){
			int k = i + 1;
			y_sum += (k - 1) * y_lines[i] - (y_count - k) * y_lines[i];
		}

		System.out.println((x_sum * y_sum) % (1000000000 + 7));

		sc.close();
	}

}
