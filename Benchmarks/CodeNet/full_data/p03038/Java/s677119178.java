import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int bc[][] = new int[m][2];
		for(int i = 0; i < m; i++) {
			bc[i][0] = sc.nextInt();
			bc[i][1] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(bc, (ab, b)->Integer.compare(ab[1], b[1]));
		int now = 0;
		for(int i = m-1; i >= 0; i--) {
			for(int j = now; j < n; j++) {
				if(a[j]<bc[i][1]){
					a[j] = bc[i][1];
					bc[i][0]--;
					now++;
				}
				if(bc[i][0]<1) {
					break;
				}
			}
			if(bc[i][0]>0) {
				break;
			}
		}
		long ans = 0;
		for(int i = 0; i < n; i++) {
			ans+=a[i];
		}
		System.out.println(ans);
	 }
}