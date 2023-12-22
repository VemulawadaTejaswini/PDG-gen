import java.util.*;

public class Main {
	static boolean[] arr;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		arr = new boolean[10];
		for (int i = 0; i < k; i++) {
			arr[sc.nextInt()] = true;
		}
		for (int i = n; ; i++) {
			if (match(i)) {
				System.out.println(i);
				return;
			}
		}
	}
	
	static boolean match(int x) {
		while (x > 0) {
			if (arr[x % 10]) {
				return false;
			}
			x /= 10;
		}
		return true;
	}
}
