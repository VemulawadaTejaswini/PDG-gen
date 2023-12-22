import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int[] list = {a,b,c};
		int min = 0;
		int mid = 0;
		int max = 0;
		int count = 0;
		Arrays.sort(list);

		min = list[0];
		mid = list[1];
		max = list[2];

		for (int i = mid; i < max; i++) {
			count++;
			min++;
		}

		for (int j = min; j < max; j+=2) {
			count++;
			min += 2;
		}

		if (min == max) {
			System.out.println(count);
		} else {
			System.out.println(count + 1);
		}

		scan.close();

	}

}
