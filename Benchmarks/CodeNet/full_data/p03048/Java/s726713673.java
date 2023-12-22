import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		for(int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		int ans = 0;
		Arrays.sort(a);
		for(int i = 0;i <= n/a[0]; i++) {
			for(int j = 0; j <= (n-i*a[0])/a[1]; j++) {
				for(int k = 0; k <= (n-i*a[0] - j*a[1])/a[2]; k++) {
					if(i*a[0] + j*a[1] + k*a[2] == n) {
						ans ++;
						
					}
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
