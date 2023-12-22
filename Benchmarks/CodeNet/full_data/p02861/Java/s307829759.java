import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {
	static double ans = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(bfr.readLine());
		
		int N = Integer.parseInt(str.nextToken());
		int[] x = new int[N+1];
		int[] y = new int[N+1];
		double cnt=1;
		for (int i=2; i<=N; i++) {
			cnt*=i;
		}
		
		for (int i=1; i<=N; i++) {
			str = new StringTokenizer(bfr.readLine());
			x[i] = Integer.valueOf(str.nextToken());
			y[i] = Integer.valueOf(str.nextToken());
		}
		
		int[] list = new int[N];
		
		dfs(list, 0, N, x, y);
		
		ans/=cnt;
		System.out.println(ans);
		
	}
	public static void dfs(int[] list, int i, int N, int[] x, int[] y) {
		if (i==list.length) {
			for (int j=0; j<list.length-1; j++) {
				
				ans+=Math.sqrt(Math.pow(x[list[j]]-x[list[j+1]], 2) + Math.pow(y[list[j]]-y[list[j+1]], 2));
			}
			
		}
		else {
			for(int j=1; j<=N; j++) {
				if(isPossible(list, j, i)) {
					list[i] = j;
					dfs(list, i+1, N, x, y);
				}
			}
		}
	}
	
	public static boolean isPossible(int[] list, int find, int check) {
		for (int i=0; i<check; i++) {
			if (list[i]==find) {
				return false;
			}
		}
		return true;
	}
}