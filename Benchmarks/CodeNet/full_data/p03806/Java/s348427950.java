import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int a[];
	int b[];
	int c[];
	int n;
	int ma;
	int mb;
	int memo[][]=new int[401][401];
	final int INF = 1001001001;
	public void run() {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		ma=sc.nextInt();
		mb=sc.nextInt();
		a=new int[n];
		b=new int[n];
		c=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=sc.nextInt();
		}
		for(int i=0; i<401; i++) {
			for(int j=0; j<401; j++) {
				memo[i][j]=INF;
			}
		}
		int ans = dfs(0, 0, 0, 0);
		if(ans ==INF) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
		sc.close();
	}

	private int dfs(int x, int sa, int sb, int sc) {
		int d=gcd(sa, sb);
		int ta=sa;
		int tb=sb;
		if(d!=0) {
			ta=sa/d;
			tb=sb/d;
		}
		if(memo[ta][tb] != INF) {
			memo[ta][tb] = Math.min(memo[ta][tb], sc);
			return memo[ta][tb];
		}

		if(x==n || ta==ma&&tb==mb) {
			if(ta==ma&&tb==mb) {
				memo[ta][tb] = sc;
				return sc;
			}else {
				return INF;
			}
		}

		int i1 = dfs(x+1, sa+a[x], sb+b[x], sc+c[x]);
		int i2 = dfs(x+1, sa, sb, sc);

		return Math.min(i1, i2);
	}

	private int gcd(int a, int b) {
		if(b==0)return a;
		return gcd(b, a%b);
	}
}
