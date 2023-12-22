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

		boolean[]dp=new boolean[k];
		loop:
		for(int i=0;i<n;++i) {
			Arrays.fill(dp,false);
			dp[0]=true;
			for(int j=0;j<n;++j)if(i!=j) {
				for(int m=k-1-a[j];m>=0;--m) {
					if((dp[m+a[j]]|=dp[m])&&m+a[j]>=k-a[i])
						continue loop;
				}
			}
			++res;
		}
		System.out.println(res);
	}
}