import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	long gcd(long a,long b) {
		return a==0?b:gcd(b%a,a);
	}

	void run() {
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		long ans=0;
		int N=sc.nextInt();
		char[] cs=sc.next().toCharArray();
		int[][] cnt=new int[N][3];
		for (int i=0;i<N;++i) {
			if (cs[i]=='R') ++cnt[i][0];
			else if(cs[i]=='G') ++cnt[i][1];
			else ++cnt[i][2];
			if (i>0) cnt[i][0]+=cnt[i-1][0];
			if (i>0) cnt[i][1]+=cnt[i-1][1];
			if (i>0) cnt[i][2]+=cnt[i-1][2];
		}
		for (int i=0;i<N;++i) {
			if (cs[i]!='R') continue;
			for (int j=0;j<N;++j) {
				if (cs[j]!='G') continue;
				ans+=cnt[N-1][2];
			}
		}
		for (int i=0;i<N;++i) {
			for (int len=1;len<=N;++len) {
				if (i+len>=N||i+2*len>=N) continue;
				if (cs[i]==cs[i+len]) continue;
				if (cs[i+len]==cs[i+2*len]) continue;
				if (cs[i]==cs[i+2*len]) continue;
				--ans;
			}
		}
		pw.println(ans);
		pw.close();
	} 
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
	
    public static void main(String[] args) {
    	new Main().run();
    }
}
