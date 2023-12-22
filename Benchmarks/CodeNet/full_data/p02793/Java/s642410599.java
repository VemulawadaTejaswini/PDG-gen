
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		long c=0;
		Arrays.sort(a);
		long h=(long)a[0];
		for(int i=1;i<n;i++) {
			h=lcm(Math.max(h,a[i]),Math.min(h, a[i]));
		}
		for(int i=0;i<n;i++) {
			c+=h/a[i];
		}
		System.out.println(c%(Math.pow(10, 9)+7));



	}
	public static long lcm(long i,long j) {
		long c=i*j;
		while(j!=0) {
			long h=i;
			i=j;
			j=h%i;
		}
		return c/i;
	}

}
