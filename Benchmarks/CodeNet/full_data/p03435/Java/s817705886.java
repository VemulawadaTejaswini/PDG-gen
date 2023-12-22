import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] grid = new int[3][3];
		for(int i =0; i < 3;i++){
			for(int j =0;j<3;j++){
				grid[i][j] = sc.nextInt();
			}
		}
		boolean b = true;
		for(int i =0; i < 3; i++){
			int x = 0;
			int y = 0;
			for(int j =0;j<3;j++){
				int bX = grid[j][i] - grid[j][((i+1) % 3)];
				int bY = grid[i][j] - grid[((i+1) % 3)][j];
				if(j ==0){
					x = bX;
					y = bY;
				}else{
					b &= x == bX;
					b &= y == bY;
				}
				if(!b) break;
			}
			if(!b) break;
		}
		System.out.println(b ? "Yes" : "No");
	}
}