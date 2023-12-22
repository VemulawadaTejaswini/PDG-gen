import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[][]dp=new int[n][3];
		for(int[]v:dp)
			Arrays.setAll(v,i->s.nextInt());
		for(int i=1;i<n;++i) {
			int[]c=dp[i-1],d=dp[i];
			d[0]+=Math.max(c[1],c[2]);
			d[1]+=Math.max(c[2],c[0]);
			d[2]+=Math.max(c[0],c[1]);
		}
		System.out.println(Arrays.stream(dp[n-1]).max().getAsInt());
	}
}
