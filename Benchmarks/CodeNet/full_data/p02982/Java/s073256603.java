import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] x = new int[n][d];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < d; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				int dist = 0;
				for(int k = 0; k < d; k++) {
					dist += Math.abs(x[i][k]- x[j][k])*Math.abs(x[i][k]- x[j][k]);	
				}
				if(Math.sqrt(dist) == (int)Math.sqrt(dist)&& dist != 0) {
					++count;
				}
			}
		}
		
		System.out.println(count);

	}
	
}
