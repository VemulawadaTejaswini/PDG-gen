import java.io.*;
import java.util.*;//java.util.scanner
import java.lang.*;//java.lang.Math
import java.text.*;
import java.math.*;
public class Main {
	private static int[] fa=new int[100005];
	private static int fd(int a) {
		if(fa[a]==a)return a;
		return fa[a]=fd(fa[a]);
	}
	public static void main(String[] args) throws IOException{
		BufferedReader re=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(re.readLine());
		int n=Integer.parseInt(t.nextToken()),m=Integer.parseInt(t.nextToken());
		int[] a= new int[100005],b=new int[100005],num=new int[100005];
		long [] ans=new long[100005];
		ans[m]=(long)n*(n-1)/2;
		for(int i=0;i<m;++i) {
			t=new StringTokenizer(re.readLine());
			a[i]=Integer.parseInt(t.nextToken());
			b[i]=Integer.parseInt(t.nextToken());
		}
		for(int i=1;i<=n;++i) {
			fa[i]=i;
			num[i]=1;
		}
		for(int i=m-1;i>=0;--i) {
			if(fd(a[i])==fd(b[i])) {
				ans[i]=ans[i+1];
			}else {
				ans[i]=ans[i+1]-num[fa[a[i]]]*num[fa[b[i]]];
				num[fa[b[i]]]+=num[fa[a[i]]];
				fa[fa[a[i]]]=fa[b[i]];
			}
		}
		for(int i=1;i<=m;++i) {
			System.out.println(ans[i]);
		}
	}
}
