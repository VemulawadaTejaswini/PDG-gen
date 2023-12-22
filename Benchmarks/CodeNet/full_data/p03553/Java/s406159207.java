import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			sum += a[i];
		}
		sc.close();
		
		int max = 0;
		int[] ps = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47};
		int[] pl = {53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		
		int lmax = 0;
		for(int i=0; i<pl.length; i++){
			if(pl[i]>n){
				break;
			}
			if(a[pl[i]-1] > 0){
				lmax += a[pl[i]-1];
			}
		}
		
		int snum = 0;
		for(int i=0; i<ps.length; i++){
			if(ps[i]>n) break;
			snum++;
		}
		
		boolean[] remain = new boolean[n];
		Arrays.fill(remain, true);
		
		for(int i=0; i<Math.pow(2, snum);i++){
			int msum = 0;
			Arrays.fill(remain, true);
			String si = Integer.toBinaryString(i);
			si = "00000000000000" + si;
			for(int j=0; j<snum; j++){
				if(si.charAt(si.length() - j -1) == '1'){
					for(int k=1; k*ps[j] <= n; k++){
						remain[k*ps[j] - 1] = false;
					}
				}
			}
			
			for(int j=0; j<n; j++){
				if(remain[j]) msum += a[j];
			}
			msum += lmax;
			if(msum > max) max = msum;
		}
		
		System.out.println(max);
	}
}