import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] ab = new int[2][m];
		for(int i=0;i<m;i++) {
			ab[0][i] = in.nextInt()-1;
			ab[1][i] = in.nextInt()-1;
		}
		int ans = 0;
		for(int i=0;i<m;i++) {
			int[] u = new int[n];
			for(int j=0;j<n;j++) {
				u[j] = j;
			}
			for(int j=0;j<m;j++) {
				if(i==j) continue;
				int a = ab[0][j];
				int b = ab[1][j];
				union(u,a,b);
			}
			int num = find(u,0);
			for(int j=1;j<n;j++) {
				if(find(u,j)!=num) {
					ans++;
					break;
				}
			}
		}
		System.out.println(ans);
		in.close();

	}
	
	public static void union(int[] u,int a,int b) {
		u[find(u,b)] = find(u,a);
	}
	
	public static int find(int[] u,int a) {
		if(a==u[a]) return a;
		else return u[a] = find(u,u[a]);
	}

}
