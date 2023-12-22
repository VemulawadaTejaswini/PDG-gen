import java.util.*;
import static java.lang.Math.*;

public class Main {
	
	public static void main(String... args) {
		System.out.println(calcExpMax(scanInt()));
	}
	
	private static final int MAX = (int) sqrt(1000d) + 4;
	
	private static int calcExpMax(int X) {
		int max = 0;
		for (int i = 2; i < MAX; ++i) {
			double exp = log(X) / log(i);
			int p = (int) pow(i, floor(exp));
			if (max < p && p <= X) {
				max = p;
			}
			if (exp < 2.0d) {
				break;
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
