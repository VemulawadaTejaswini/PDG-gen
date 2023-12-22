import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long h=sc.nextLong();
		long[] a=new long[n];
		long[] b=new long[n];
		long max=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextLong();
			b[i]=sc.nextLong();
			max=Math.max(max, a[i]);
		}
		
		Arrays.sort(b);
		int cnt=0;
		int k=n-1;
		while(k>=0 && b[k]>max && h>0){
			h-=b[k]; k--; cnt++;
		}
		cnt+=(h+max-1)/max;
		System.out.println(cnt);		
	}	
}
