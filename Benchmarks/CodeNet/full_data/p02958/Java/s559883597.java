import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		int max = Integer.MIN_VALUE, maxId = 0, min = Integer.MAX_VALUE, minId = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			if (arr[i] < min) {
				min = arr[i];
				minId = i;
			}
			if (arr[i] > max) {
				max = arr[i];
				maxId = i;
			}
		}
		boolean f = false;
		if (minId == 0 && maxId == n - 1) {
			int cnt = 0;
			for (int i = 0; i < n - 1; i++) {
				for (int j = 1; j < n; j++) {
					if (arr[i] > arr[j]) {
						int t = arr[i];
						arr[i] = arr[j];
						arr[j] = t;
						cnt++;
					}
					// check
					f = check(arr);
					if (cnt == 1 || f)
						break;
				}
				if (cnt == 1 || f)
					break;
			}
			if (f)
				System.out.println("YES");
			else
				System.out.println("NO");
		} else {
			int t = arr[maxId];
			arr[maxId] = arr[minId];
			arr[minId] = t;
			f = check(arr);
			if (f)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		in.close();
	}

	public static boolean check(int arr[]) {
		int n = arr.length;
		int order[] = new int[n];
		for (int i = 0; i < n; i++)
			order[i] = arr[i];
		Arrays.sort(order);
		for (int i = 0; i < n; i++) {
			if (arr[i] != order[i])
				return false;
		}
		return true;
	}
}
