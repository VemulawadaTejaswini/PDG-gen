import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for (int i = -100; i <= 100; i++) {
			int v = 0;
			for (int j = 0; j < n; j++) {
				v += (arr[j] - i) * (arr[j] - i);
			}
			if (min > v) {
				min = v;
			}
		}
		System.out.println(min);
	}
}
