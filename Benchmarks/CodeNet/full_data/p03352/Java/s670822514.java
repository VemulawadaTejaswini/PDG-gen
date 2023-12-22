import java.util.*;
import static java.lang.Math.*;

public class Main {
	
	public static void main(String... args) {
		System.out.println(calcExpMax(scanInt()));
	}
	
	private static final int MAX = (int) sqrt(1000d) + 1;
	
	private static int calcExpMax(int X) {
		int max = 1;
		for (int i = 2; i < MAX; ++i) {
			int pow = i;
			for (int j = 2; j < 9; ++j) {
				pow *= i;
				if (X < pow) {
					break;
				}
				if (max < pow) {
					max = pow;
				}
			}
		}
		return max;
	}

	
	private static final Scanner SC = new Scanner(System.in);

	private static int scanInt() {
		return SC.nextInt();
	}

	private static  String scanString() {
		return SC.next();
	}
}
