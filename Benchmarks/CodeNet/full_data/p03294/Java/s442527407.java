import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int m = 1;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int ans = 0;
		for(int i = 0; i < 214748; i++) {
			int temp = 0;
			for(int j = 0; j < n; j++) {
				temp += i % a[j];
			}
			ans = Math.max(ans, temp);
		}
		System.out.println(ans);
	}
}
