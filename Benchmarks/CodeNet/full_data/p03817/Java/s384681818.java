import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long ans = 0;
		ans += (x / 11) * 2;
		x %= 11;
		for (int i = 0; x > 0; i ^= 1) {
			if (i == 0) {
				x -= 5;
			} else {
				x -= 6;
			}
			++ans;
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
