import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int monster = scan.nextInt();
		int waza = scan.nextInt();
		long[] hp = new long[monster];

		for(int i=0;i<monster;i++) {

			hp[i] = scan.nextInt();
		}

		long sum = 0;

		Arrays.sort(hp);

		for(int i=0;i<monster-waza;i++) {

			sum += hp[i];
		}

		   System.out.println(sum);

		scan.close();
	}

}
