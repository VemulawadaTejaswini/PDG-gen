import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		
		for(int i=0; i<n; i++){
			a[i] = sc.nextLong();
		}
		if(n == 1){
			if(a[0] % 2 == 1){
				System.out.println("first");
			}else{
				System.out.println("second");
			}
		}else{
			quick_sort(a, 0, n-1);
			if((a[0]-a[1]) % 2 == 1){
				System.out.println("first");
			}else{
				System.out.println("second");
			}
		}
	}
	
	static void quick_sort(long[] d, int left, int right) {
		if(left>=right){
				return;
		}
		long p = d[(left+right)/2];
		int l = left, r = right;
		long tmp;
		while(l<=r){
			while(d[l] < p){ l++; }
			while(d[r] > p){ r--; }
			if (l<=r) {
				tmp = d[l]; d[l] = d[r]; d[r] = tmp;
				l++;
				r--;
			}
		}
		quick_sort(d, left, r);
		quick_sort(d, l, right);
	}
}