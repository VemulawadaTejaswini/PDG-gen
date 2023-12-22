import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int time = 0;
		int num = c;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (num >= c || arr[i] > time + k) {
				count++;
				num = 1;
				time = arr[i];
			} else {
				num++;
			}
		}
		System.out.println(count);
	}
}
