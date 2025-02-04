import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner io = new Scanner(System.in);	
		int N = io.nextInt();
		int Ma = io.nextInt();
		int Mb = io.nextInt();
		int[][] data = new int[N+1][3];
		for (int i = 1; i <= N; i++) {
			data[i][0] = io.nextInt();
			data[i][1] = io.nextInt();
			data[i][2] = io.nextInt();
		}
		
		int[][][] table = new int[N+1][N*10+1][N*10+1];
		for (int i = 0; i < N+1; i++) {
			for (int j = 0; j < N*10+1; j++) {
				for (int j2 = 0; j2 < N*10+1; j2++) {
					table[i][j][j2] = 10000;
				}
			}
		}
		table[0][0][0] = 0;
		int na , nb ,value;
		for (int i = 1; i <= N; i++) {
			na = data[i][0];
			nb = data[i][1];
			value = data[i][2];
			for (int j = 0; j < N*10+1; j++) {
				for(int k = 0; k < N*10+1; k++){
					if(j-na<0||k-nb<0)
						table[i][j][k] = table[i-1][j][k];
					else
						table[i][j][k] = 
							Math.min(table[i-1][j][k],
									table[i-1][j-na][k-nb]+value);
				}
			}
		}
		int ans = 10000;
		for(int i=0;i<N*10+1;i++){
			for(int j=0;j<N*10+1;j++){
				if(i==0&&j==0) continue;
				if(i*Mb == j*Ma) ans = Math.min(ans,table[N][i][j]);
			}
		}
		
		System.out.println((ans==10000)?-1:ans);
		
	}
}