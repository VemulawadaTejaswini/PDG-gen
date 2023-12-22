import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int ans = 0;
		
		for (int i=0;i < n;i++) {
			int var = a[i];
			for (int j = i+1;j < n;j++) {
				var += a[j];
				if (var == 0) ans++;
			}
		}
		System.out.println(ans);
	}
}
