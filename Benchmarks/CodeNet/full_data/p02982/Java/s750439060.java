import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] x = new int[n][d];
		for(int i=0;i<n;i++) {
			for(int k=0;k<d;k++) {
				x[i][k] = sc.nextInt();
			}
		}
		int ans =0;
		for(int i=0;i<n;i++) {
			for(int k=i+1;k<n;k++) {
				double dist = 0;
				for(int l =0;l<d;l++) {
					dist += (x[i][l]-x[k][l])*(x[i][l]-x[k][l]);
				}	
				int dist2 = (int)Math.sqrt(dist);
				if(dist2*dist2 == dist) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
	
	static long factr(long n,long p,long q) {
		if(n==p) {
			return 1l;
		}
		long ma = Math.max(p, q);
		long mi = Math.min(p, q);
		ArrayList<Long> mm = new ArrayList<Long>();
		for(int i=1;i<=mi;i++) {
			mm.add((long) i);
		}
		long ret = fact(n,ma,mm);
		return ret;
	}
	static long fact(long n,long m,ArrayList<Long> mm) {
		if(n==m) {
			return 1l;
		}
		long pre = fact(n-1,m,mm);
		for(int i=0;i<mm.size();i++) {
			if(pre%mm.get(i) ==0) {
				pre = pre/mm.get(i);
				mm.set(i, 1l);
			}
		}
		return (n*pre);
	}
}