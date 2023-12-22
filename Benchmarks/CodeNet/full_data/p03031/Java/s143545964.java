import java.util.*;
public class Main {
	

	static int[] ps;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] connections = new int[n][m];

		ps = new int[m];
		int ans = 0;

		for(int i = 0; i < m ; i++) {
			int k = sc.nextInt();
			for(int j = 0; j<k ; j++) {
				int s = sc.nextInt() - 1 ;
				connections[s][i] = 1;
			}
		}
		
		for(int i = 0; i < m ; i++) {
			
			ps[i] = sc.nextInt();
		}
		
		double NUM = Math.pow(2, (double)n);
		for(int i=0;i<NUM;i++) {

			ans += isOn(m,n,i,connections);
		}
		

		System.out.println(ans);

	}
	
	public static int isOn(int m, int n, int NUM, int[][] connections) {
		for(int j=0;j<m;j++) {
			int count = 0;
			for(int k=0;k<n;k++) {
				count += connections[k][j] * (NUM / (int)Math.pow(2,k) % 2);
			}
			if((count % 2) != ps[j]) {
				return 0;
			}
			
		}
		return 1;
	}
}