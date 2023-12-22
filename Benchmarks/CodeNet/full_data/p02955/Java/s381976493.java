import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		int total = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		int max = 1;
		for (int i = 1; i * i <= total; i++) {
			if (total % i == 0) {
				int a = i;
				int b = total / i;
				int resultA = check(arr, a);
				if (resultA <= k && max < a) {
					max = a;
				}
				int resultB = check(arr, b);
				if (resultB <= k && max < b) {
					max = b;
				}
			}
		}
		System.out.println(max);
	}
	
	static int check(int[] arr, int x) {
		int n = arr.length;
		int[] mods = new int[n];
		for (int i = 0; i < n; i++) {
			mods[i] = arr[i] % x;
		}
		Arrays.sort(mods);
		int[] sumsA = new int[n];
		int[] sumsB = new int[n];
		int prevA = 0;
		int prevB = 0;
		for (int i = 0; i < n; i++) {
			sumsA[i] = mods[i] + prevA;
			prevA = sumsA[i];
			sumsB[n - 1 - i] = (x - mods[n - 1 - i]) % x + prevB;
			prevB = sumsB[n - 1 - i];
		}
		for (int i = 0; i < n - 1; i++) {
			if (sumsA[i] == sumsB[i + 1]) {
				return sumsA[i];
			}
		}
		return -1;
	}
}
