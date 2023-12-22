import java.util.*;
public class Main {
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		
		int n = sc.nextInt();
		
		int[] x = new int[n];
		int[] y = new int[n];
		
		for(int i=0;i<n;i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		int cost = 1;
		
		
		int[][] points = new int[n][n];
		int max = 0;
		
		int mx = -1;
		int my = -1;
//		System.out.println("==");

		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int dx = x[i] - x[j]; // p
				int dy = y[i] - y[j]; // q
				
				int pp = 0;
				
				
				for(int ii=0;ii<n;ii++) {
					for(int jj=ii+1;jj<n;jj++) {
						int ddx = x[ii] - x[jj];
						int ddy = y[ii] - y[jj];
						
						
						
						if((ddx == dx && ddy == dy) || (ddx == -dx && ddy == -dy)) {
							pp += 1;
//							System.out.println(ii + " " + jj + " " + "dx;" + dx + "dy:" + dy + "   " + ddx + " " + ddy);
						}
					}
				}
				
				points[i][j] = pp;
				max = max <  pp ? pp : max;
				mx = dx;
				my = dy;
//				System.out.println("==");
			}
		}
		
		
		System.out.println( n - max);
//		System.out.println(mx + " " + my);
//		System.out.println(max);
	}
	


}