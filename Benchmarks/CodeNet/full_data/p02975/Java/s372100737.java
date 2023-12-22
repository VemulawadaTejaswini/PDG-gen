import java.util.Scanner;

public class Main {

	public static boolean checkXOR(long a0, long a1, long a2) {
		long a012 = a0 ^ a1 ^ a2;
		if (0 == a012)
			return true;
		else
			return false;
	}

	public static boolean check3(long[] a) {
		int cnt0 = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		long base0 = 0L;
		long base1 = 0L;
		long base2 = 0L;
		for (int i = 0; i < a.length; i++) {
			if (base0 == 0) {
				cnt0++;
				base0 = a[i];
			} else if (base1 == 0) {
				cnt1++;
				base1 = a[i];
			} else if (base2 == 0) {
				cnt2++;
				base2 = a[i];
				if (!checkXOR(base0, base1, base2))
					return false;
			} else if (a[i] == base0) {
				cnt0++;
			} else if (a[i] == base1) {
				cnt1++;
			} else if (a[i] == base2) {
				cnt2++;
			} else
				return false;
		}
		if (cnt0 == a.length / 3 && cnt1 == a.length / 3 && cnt2 == a.length / 3)
			return true;
		else
			return false;
	}

	public static boolean check2_3(long[] a) {
		int cnt = 0;
		long aBase = 0L;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0 && aBase == 0) {
				cnt++;
				aBase = a[i];
			} else if (a[i] != 0 && aBase == a[i]) {
				cnt++;
			}
		}
		if (cnt == a.length * 2 / 3)
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
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLong();
		}
		sc.close();

		if (N % 3 != 0) {
			System.out.println("No");
			return;
		}
		if (check0(a)) {
			System.out.println("Yes");
			return;
		}
		if (check2_3(a)) {
			System.out.println("Yes");
			return;
		}
		if (check3(a)) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
		return;
	}
}