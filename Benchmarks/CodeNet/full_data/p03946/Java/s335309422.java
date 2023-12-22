import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.next();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) a[i] = Integer.parseInt(sc.next());
		int[] b = new int[n]; Arrays.fill(b, 0);
		int[] c = new int[n]; Arrays.fill(c, 0);
		int min = -1;
		int count = 0; int max = 0; int dis = 0; int ans = 0;
		for (int i = n-1; i >= 0; i--) {
			if(max < a[i]) {
				count = 1;
				max = a[i];
			}else if(max == a[i]){
				count++;
			}else {
				b[i] = max;
				c[i] = count;
				dis = Math.max(max-a[i], dis);
			}
		}
		for (int i = 0; i < n; i++) {
			if(min == -1) {
				if(b[i]-a[i] == dis) {
					min = b[i];
					ans += c[i];
				}
			}else {
				if((b[i]-a[i]==dis)&&(min != b[i])) {
					min = b[i];
					ans += c[i];
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}