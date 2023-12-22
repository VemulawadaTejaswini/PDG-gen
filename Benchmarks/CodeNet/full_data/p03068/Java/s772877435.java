import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int k = sc.nextInt();
		char c = arr[k - 1];
		for (int i = 0; i < n; i++) {
			if (arr[i] != c) {
				arr[i] = '*';
			}
		}
		System.out.println(arr);
	}
}
