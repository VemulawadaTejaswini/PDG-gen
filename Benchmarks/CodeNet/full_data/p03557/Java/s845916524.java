import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arrayA[] = new int[n];
		int arrayB[] = new int[n];
		int arrayC[] = new int[n];

		for (int i = 0; i < n; i++) {
			arrayA[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arrayB[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arrayC[i] = sc.nextInt();
		}
		//全探索すると間に合わない
		Arrays.sort(arrayA);
		Arrays.sort(arrayC);
		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += binary_search(arrayA, arrayB[i]) * (n - binary_search(arrayC, arrayB[i] + 1));
		}
		System.out.println(ans);
	}

	//arrayのうち、targetより小さい要素の数を数える
	//r-l=1になったとき、rはtarget以上の数のうち最大のものを持っているから、そのインデックスが所望の要素数に等しい
	public static long binary_search(int[] array, int target) {
		int l = -1;
		int r = n;
		while (r - l > 1) {
			int mid = (r + l) / 2;		//intの割り算はintの商
			if (array[mid] < target) {
				l = mid;
			} else
				r = mid;
		}
		return r;
	}

}
