import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] s = new String[n];
		Set<String> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			s[i] = str;
			set.add(str);
		}

		int m = sc.nextInt();
		String[] t = new String[m];
		for (int i = 0; i < m; i++) {
			t[i] = sc.next();
		}

		int max = 0;
		for (String key : set) {
			int plus = 0;
			for (String strS : s) {
				if (key.equals(strS))
					plus++;
			}
			int minus = 0;
			for (String strT : t) {
				if (key.equals(strT))
					minus++;
			}
			// debug
//			System.out.println("key : " + key);
//			System.out.println(" plus : " + plus);
//			System.out.println(" minus : " + minus);

			int tmp = plus - minus;
			if (tmp > max)
				max = tmp;
		}
		System.out.println(max);

		sc.close();
	}
}
