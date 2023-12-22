import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] b = new int[n];
		int[] a = new int[n];
		int[] A = new int[n];
		int[] B = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			A[i] = a[i];
		}
		Arrays.sort(A);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(A[i] == a[j]) {
					B[i] = b[j];
				}
			}
		}
		int cnt = 0;
		long ans = 0;
		int cnt2 = 0;
		int cnt3 = B[0];
		
		while(true) {
			if(cnt + B[cnt2] < m) {
				cnt += B[cnt2];
				ans += A[cnt2] * B[cnt2];
				cnt2 ++;
				cnt3 = B[cnt2];
			}else {
				if(cnt3 != 0) {
					cnt ++;
					ans += A[cnt2];
					cnt3 --;
				}else {
					cnt2 ++;
					cnt3 = B[cnt2];
				}
			}
			
			if(cnt == m) {
				break;
			}
			
		}
		System.out.println(ans);
		sc.close();
	}
}

