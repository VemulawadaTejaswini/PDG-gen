import java.util.*;

public class Main {
	
	static int[] pre, dis;
	static final int maxn = 10000005;
	static int find(int x) {
		while(x!=pre[x]) {
			int r = pre[x];
			pre[x] = pre[r];
			dis[x] += dis[r];
			x = r;
		}
		return x;
	}
	static boolean merge(int x,int y,int z) {
		int px = find(x);
		int py = find(y);
		if(px==py) {
			return z == dis[y]-dis[x];
		}
	    pre[py] = pre[px];
	    dis[py] = dis[x]+z-dis[y];
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		pre = new int[maxn];
		dis = new int[maxn];
		for (int i = 1; i < maxn; i++) pre[i] = i;
		
		boolean ans = true;
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		for (int i = 0; i < m; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int z = scanner.nextInt();
            if(ans) 
            	ans = merge(x,y,z);
		}
		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}