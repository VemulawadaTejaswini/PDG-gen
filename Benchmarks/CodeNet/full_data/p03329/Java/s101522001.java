import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= n; i++) {
			int count = 0;
			int six = i;
			while (six > 0) {
				count += six % 6;
				six /= 6;
			}
			int nine = n - i;
			while (nine > 0) {
				count += nine % 9;
				nine /= 9;
			}
			if (min > count) {
				min = count;
			}
		}
		System.out.println(min);
	}
}
