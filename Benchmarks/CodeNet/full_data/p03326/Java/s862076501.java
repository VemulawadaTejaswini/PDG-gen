import java.util.*;
class cake {
	public long x,y,z;
}
public class Main {
	static long ans = 0;
	static int n,m;
	static cake [] s;
	static void dfs(int k,int t,long x,long y,long z) {
		if(t >= m) {
			ans = Math.max(ans, Math.abs(x) + Math.abs(y) + Math.abs(z)); 
			return;
		}
		if(m - t > n - k)return;
		for(int i = k;i < n;i ++) {
			dfs(i + 1,t + 1,x + s[i].x,y + s[i].y,z + s[i].z);
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		s = new cake[n];
		for(int i = 0;i < n;i ++) {
			s[i] = new cake();
			s[i].x = in.nextLong();
			s[i].y = in.nextLong();
			s[i].z = in.nextLong();
		}
		dfs(0,0,0,0,0);
		System.out.println(ans);
	}
}
