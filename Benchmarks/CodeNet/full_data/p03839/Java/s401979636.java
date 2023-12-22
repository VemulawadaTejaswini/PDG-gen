import java.util.Arrays;
import java.util.Scanner;
class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt();
		int[]a=new int[n+1],b=new int[n+1];
		for(int i=1;i<=n;++i) {
			a[i]=s.nextInt();
			b[i]=a[i]>0?a[i]:0;
		}
		Arrays.parallelPrefix(a,Integer::sum);
		Arrays.parallelPrefix(b,Integer::sum);
		int r=0;
		for(int i=0;i<=n-k;++i){
			System.out.println();
			r=Math.max(r,b[i]+b[n]-b[i+k]+Math.max(0,a[i+k]-a[i]));
		}
		System.out.println(r);
	}
}