import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		boolean [][]g = new boolean [8][8];
		
		for(int i = 0; i < n ;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			g[a - 1][b - 1] = true;
			g[b - 1][a - 1] = true;
		}
		boolean []visit = new boolean [n];
		visit[0] = true;
		int count = dfc(n,0,g,visit);
		System.out.println(count);
		
	}
	
	private static int dfc(int n ,int v, boolean[][]g , boolean[]visit) {
		
		boolean allvisit = true;
		for(int i = 0 ; i < n  ;i++) {
			if(!visit[i]) {
			allvisit = false;
			break;
			}
		}
		if(allvisit) {
			return 1;
		}
		
		int sum = 0;
		
		for(int i = 0; i < n ; i++) {
			if(!visit[i] && g[v][i]) {
				visit[i] = true;
				sum += dfc(n,i,g,visit);
				visit[i] = false;
			}
		}
		return sum;
		
	}

}
