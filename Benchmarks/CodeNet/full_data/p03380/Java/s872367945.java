import java.util.Scanner;
import java.util.Arrays;
public class Main{
	static long[] a;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long max=0;
		long f=0;
		a = new long[n];
		for(int i = 0; i<n; i++){
			a[i]=sc.nextLong();
		}
		Arrays.sort(a);
		for(int i=0; i<n-1; i++){
			if(max<comb(a[n-1],a[i])){
				max=comb(a[n-1],a[i]);
				f=a[i];
			}
		}
		System.out.println(a[n-1]+" "+f);
	}
	public static long comb(long c,long b){
		long y=1;
		long t=1;
		for(int i = 1; i<=b; i++){
			y*=c+1-i;
			t*=i;
		}
		return y/t;
	}
}