import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n,m,v,p;
	static int a[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		 m = sc.nextInt();
		 v = sc.nextInt();
		 p = sc.nextInt();
		 a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		int ans = n-binarySearch(0,n-1);
		System.out.println(ans);
		
	}
	static int binarySearch(int lo,int hi) {
		int mid = (lo+hi)/2;
		if(works(mid)) {
			if(!works(mid-1)) {
				return mid;
			}
			return binarySearch(lo,mid-1);
		}
		else {
			if(works(mid+1)) {
				return mid+1;
			}
			return binarySearch(mid+2,hi);
		}
		
	}
	static boolean works(int x) {
		if(x>=n || x<0) return false;
		long totUsed =0;
		int numGreater =0;
		int numMid= 0;
		for(int i=0;i<n;i++) {
			
			if(a[i]<=a[x]) {
				totUsed+=m;
			}
			else if(a[i]<=(a[x]+m)) {
				numMid++;
			}
			else {
				numGreater++;
				totUsed+=m;
			}
		}
		long k = (long) (m)*(v);
		if(numGreater>=p) return false;
		
		int add = Math.min(p-1-numGreater,numMid);
		numMid-=add;
		for(int i=0;i<n;i++) {
			if(a[i]>a[x]) {
				if(a[i]<=(a[x]+m)) {
					if(numMid>0) {
						numMid--;
						totUsed+=a[x]+m-a[i];
					}
				}
			}
		}
		totUsed+=(long) m*add;
		
		return totUsed>=k;
		
	}
}
