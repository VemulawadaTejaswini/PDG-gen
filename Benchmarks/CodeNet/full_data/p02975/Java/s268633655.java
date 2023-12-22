public class PAFalse {

	public static boolean calcThisLevel(long[] a, long[] b, long mod, long ans) {
		// bがひとつ前の位の10として
		// 0がすべて一致するか，
		// 0がすべて1になるかしないといけない
		int cnt = 0;
		int cnt0 = 0;
		int mode = 0;
		//System.out.println("cnt=" + cnt + ":" + "cnt0=" + cnt0 + ":" + "ans=" + ans);
		for (int i = 0; i < a.length; i++) {
			//System.out.println(a[i] + ":" + a[i] % mod + ":" + "b[i]=" + b[i]);
			//if (b[i] == 0) {
				//System.out.println("mode:" + mode + ":" + (mode == 2 && a[i] == ans));
			//	if (mode == 0 && a[i] == 0)
			//		mode = 2;
			//	else if (mode == 0 && a[i] == ans)
			//		mode = 1;
			//	else if (mode == 1 && a[i] == 0)
			//		return false;
			//	else if (mode == 2 && a[i] == ans)
			//		return false;
			//}

			if (a[i] % mod == ans) {
				cnt++;
				a[i] -= ans;
				b[i] = 1;
			} else {
				cnt0++;
				b[i] = 0;
			}
		}
		//System.out.println("cnt=" + cnt + ":" + "cnt0=" + cnt0 + ":" + "ans=" + ans);
		if (cnt == a.length * 2 / 3 || cnt0 == a.length)
			return true;
		else
			return false;
	}

	public static boolean calcThisLevel1st(long[] a, long[] b, long mod, long ans) {
		int cnt = 0;
		int cnt0 = 0;
		for (int i = 0; i < a.length; i++) {
			//System.out.println(a[i] + ":" + a[i] % mod);

			if (a[i] % mod == ans) {
				cnt++;
				a[i] -= ans;
				b[i] = 1;
			} else {
				cnt0++;
				b[i] = 0;
			}
		}
		if (cnt == a.length * 2 / 3 || cnt0 == a.length)
			return true;
		else
			return false;
	}

	public static boolean check0(long[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] a = new long[N];
		long[] b = new long[N];
		long MaxA = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLong();
			b[i] = 0;
			if (a[i] > MaxA)
				MaxA = a[i];
		}
		MaxA *= 2;
		sc.close();

		//System.out.println(MaxA);
		// 9
		// 3 2 3 3 2 3 1 0 1
		// これでNoが出せないそれがWA
		// というか嘘解法
		// 6
		// 59157337 55005153 12707000 59157337 55005153 12707000

		if (check0(a)) {
			System.out.println("Yes");
			return;
		}

		if (N % 3 != 0) {
			System.out.println("No");
			return;
		}

		long mod = 2;
		long ans = 1;
		do {
			if (mod == 2) {
				if (!calcThisLevel1st(a, b, mod, ans)) {
					System.out.println("No");
					return;
				}
			} else {
				if (!calcThisLevel(a, b, mod, ans)) {
					System.out.println("No");
					return;
				}
			}
			mod *= 2;
			ans *= 2;
		} while (mod < MaxA);

		System.out.println("Yes");
		return;
	}
}