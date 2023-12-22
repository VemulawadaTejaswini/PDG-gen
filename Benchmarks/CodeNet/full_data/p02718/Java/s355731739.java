import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		Integer list[] = new Integer[X];
		for (int i = 0; i < X; i++) {
			list[i] = sc.nextInt();
		}
		Arrays.sort(list, Collections.reverseOrder());
		int total = 0;
		for (int tmp : list) {
			total += tmp;
		}
		int judg = 0;
		int num = 0;
		int miman = 0;
		for (int i = 0; i < Y; i++) {
			num = list[i].intValue();
			miman = total / (4 * Y);
			if (num < miman) {
				System.out.println("No");
				judg = -1;
				break;
			}
		}
		if (judg == 0) {
			System.out.println("Yes");
		}
	}
}
