import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //n個の点
		int d = stdIn.nextInt(); //d次元
		
		int[][] x = new int[n][d];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < d; j++) {
				x[i][j] = stdIn.nextInt();
			}
		}
		
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				int norm = 0;
				
				for(int k = 0; k < d; k++) {
					int diff = Math.abs(x[i][k]-x[j][k]);
					norm += diff*diff;
					
				}
				//check whether norm = k for some k
				boolean flag = false;
				
				for(int k = 0; k <= norm; k++) {
					if(k*k == norm) {
						flag = true;
						cnt++;
					}
				}
				
				
			}
		}
		System.out.println(cnt);
		
	}

}
