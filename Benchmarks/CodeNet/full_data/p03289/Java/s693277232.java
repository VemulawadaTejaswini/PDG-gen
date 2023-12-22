import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean f = true;
		f &= str.charAt(0) == 'A';
		int cnt = 0;
		for (int i = 2; i < str.length() - 1; ++i) {
			if (str.charAt(i) == 'C')
				++cnt;
		}
		f &= cnt == 1;
		String str2 = str.toLowerCase();
		cnt = 0;
		for (int i = 0; i < str.length(); ++i) {
			if (str.charAt(i) != str2.charAt(i))
				++cnt;
		}
		f &= cnt == 2;
		System.out.println(f ? "AC" : "WA");
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}