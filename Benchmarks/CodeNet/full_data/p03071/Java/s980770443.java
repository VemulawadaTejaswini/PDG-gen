import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ba = sc.nextInt();
		int bb = sc.nextInt();
		int count = 0;
		if (ba > bb) {
			count += ba;
			ba--;
		} else {
			count += bb;
			bb--;
		}

		if (ba > bb) {
			count += ba;
			ba--;
		} else {
			count += bb;
			bb--;
		}
		System.out.println(count);
	}

}
