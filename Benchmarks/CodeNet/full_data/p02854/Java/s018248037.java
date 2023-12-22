import java.util.*;
public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0;
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			long tp = sc.nextLong();
			if(i == 0) {
				a[0] = tp;
				continue;
			}
			a[i] =  a[i-1] + tp;
		}
		for(int p = 0; p < a.length; p++) {
			long tp2 = Math.abs((a[a.length-1] - a[p]) - a[p]);
			if(p == 0 || ans > tp2)
			ans = tp2;
		}
		System.out.println(ans);
     }
}