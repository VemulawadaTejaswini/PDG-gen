import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		int max = 0;
		for (int i = 1; i <= 1000; ++i) {
			if (i != 1) {
				for (int j = 2; j <= 10; ++j) {
					int tmp = (int) Math.pow(i, j);
					if (tmp <= x)
						max = Math.max(max, tmp);
					else
						break;
				}
			} else {
				if (i <= x)
					max = Math.max(max, i);
			}
		}
		System.out.println(max);
	}

}
