import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		int m = 100000;
		int[] vcnt0 = new int[m],vcnt1 = new int[m];
		int i,cnt = 0;
		for(i = 0;i < n;i ++) {
			v[i] = sc.nextInt();
			if(i % 2 == 0) {
				vcnt0[v[i]] += 1;
			}else {
				vcnt1[v[i]] += 1;
			}
		}
		int max0 = 0,max1 = 0,maxidx0 = 0,maxidx1 = 0;
		for(i = 0;i < m;i ++) {
			if(max0 < vcnt0[i]) {max0 = vcnt0[i]; maxidx0 = i;}
			if(max1 < vcnt1[i]) {max1 = vcnt0[i]; maxidx1 = i;}
		}
		/*System.out.println(vcnt0[maxidx0]);
		System.out.println(vcnt1[maxidx1]);*/
		if(maxidx0 == maxidx1) {
			System.out.println(n/2);
			return;
		}
		//Arrays.sort(vcnt0); Arrays.sort(vcnt1);
		cnt = (n/2 - vcnt0[maxidx0]) + (n/2 - vcnt1[maxidx1]);
		System.out.println(cnt);
	}
}