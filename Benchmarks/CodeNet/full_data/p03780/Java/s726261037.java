import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int n=gInt(),k=gInt();
		int[]a=IntStream.range(0,n).map(i->gInt()).filter(i->i<k).toArray();
		n=a.length;

		int res=0;

		boolean[]dp=new boolean[k+1];
		for(int i=0;i<n;++i) {
			dp[0]=true;

			for(int j=0;j<n;++j)if(i!=j) {
				for(int m=k-a[j];m>=0;--m) {
					dp[m+a[j]]|=dp[m];
				}
			}
			if(IntStream.rangeClosed(k-a[i],k-1).noneMatch(o->dp[o]))
				++res;

			Arrays.fill(dp,false);
		}
		System.out.println(res);
	}
}