import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long d=sc.nextLong();
		long a=sc.nextLong();
		long[][] xh=new long[n][2];
		for(int i=0; i<n; i++){
			xh[i][0]=sc.nextLong();
			xh[i][1]=sc.nextLong();
		}
		Arrays.sort(xh,(x,y)->Long.compare(x[0],y[0]));
		long[] im=new long[n+1];
		int state=1;
		long ans=0;
		for(int i=0; i<n; i++){
			long dis=xh[i][0]+2*d;
			while(state<n && dis>xh[state][0]){
				state++;
			}
			ans+=Math.max(0,(xh[i][1]-im[i]+a-1)/a);
			im[i+1]=im[i]+Math.max(0,(xh[i][1]-im[i]+a-1)/a*a);
			im[state]=-Math.max(0,(xh[i][1]-im[i]+a-1)/a*a);
		}
		System.out.println(ans);
	}
}
