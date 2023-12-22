
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int ans = 100000;
		for(int i = 1; i <= n; i++) {
			int tmp1 = 0;
			int tmp2 = 0;
			for(int j = 0; j < n; j++) {
				if(j <= i) {
					tmp1 += a[j];
				}else {
					tmp2+= a[j];
				}
			}
			int tmp3 = Math.abs(tmp1-tmp2);
			ans = Math.min(ans, tmp3);
		}
		System.out.println(ans);
		sc.close();
	}
	
    
}
