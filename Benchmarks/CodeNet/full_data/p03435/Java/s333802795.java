import java.util.Scanner;

public class Main {

	final int size = 3;
	final int[][] grid = new int[size][size];
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<size; i++)
			for(int j=0; j<size; j++) grid[i][j] = sc.nextInt();
		sc.close();
		int aAry[] = new int[size];
		int bAry[] = new int[size];
		
		for(int i=0; i <= grid[0][0]; i++) {
			aAry[0] = i;
			bAry[0] = grid[0][0] - aAry[0];
			bAry[1] = grid[0][1] - aAry[0];
			bAry[2] = grid[0][2] - aAry[0];
			aAry[1] = grid[1][0] - bAry[0];
			aAry[2] = grid[2][0] - bAry[0];
			if(judge(aAry, bAry)) {
				System.out.println("Yes");
				return;
			}
		}
		
		System.out.println("No");
	}

	boolean judge(int aAry[], int bAry[]) {
		boolean res = true;
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(grid[i][j] != aAry[i] + bAry[j]) return false;
			}
		}
		
		return res;
	}
}