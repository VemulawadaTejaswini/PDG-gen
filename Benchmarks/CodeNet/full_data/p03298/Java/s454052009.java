import java.util.*;

public class Main {
	static long ans = 0;
	static int n;
	static boolean visited[];
	static void getlr(String s,int l,int r,int num) {
        if(n - num > n * 2 - l)return;
		if(num == n) {
			ans ++;
			return;
		}
		for(int i = l;i < n * 2 - 1;i ++) {
			if(visited[i])continue;
			visited[i] = true;
			for(int j = r;j >= 0;j --) {
				if(visited[j])continue;
				if(s.charAt(i) == s.charAt(j)) {
					visited[j] = true;
					getlr(s,i + 1,j - 1,num + 1);
					visited[j] = false;
				}
			}
			visited[i] = false;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		visited = new boolean[n * 2];
		String s = in.next();
		getlr(s,0,n * 2 - 1,0);
		System.out.println(ans);
	}

}
