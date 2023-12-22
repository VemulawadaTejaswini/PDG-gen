import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] trees = new int[n];
		for(int i=0; i<n; i++){
			trees[i] = sc.nextInt();
		}
		
		quick_sort(trees, 0, n-1);
		
		int min = trees[n-1];
		for(int i=0; i<n-k+1; i++){
			if(trees[i+k-1] - trees[i] < min){
				min = trees[i+k-1] - trees[i];
			}
		}
		
		System.out.println(min);
	}
	
	static void quick_sort(int[] d, int left, int right) {
		if(left>=right){
				return;
		}
		int p = d[(left+right)/2];
		int l = left, r = right, tmp;
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