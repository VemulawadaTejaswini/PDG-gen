import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 1; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		arr[0] = arr[1];
		arr[n] = arr[n - 1];
		int total = 0;
		for (int i = 0; i < n; i++) {
			total += Math.min(arr[i], arr[i + 1]);
		}
		System.out.println(total);
	}
}
