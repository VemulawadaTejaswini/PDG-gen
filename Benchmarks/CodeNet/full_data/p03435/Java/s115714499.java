import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int[][] grid = new int[3][3];
      	for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        for(int a1 = 0; a1 <= Math.min(grid[0][0], Math.min(grid[0][1], grid[0][2])); a1++){
            for(int a2 = 0; a2 <= Math.min(grid[1][0], Math.min(grid[1][1], grid[1][2])); a2++){
                for(int a3 = 0; a3 <= Math.min(grid[2][0], Math.min(grid[2][1], grid[2][2])); a3++){
                    if((grid[0][0] - a1 != grid[1][0] - a2) || (grid[1][0] - a2 != grid[2][0] - a3)){
                        continue;
                    }
                    if((grid[0][1] - a1 != grid[1][1] - a2) || (grid[1][1] - a2 != grid[2][1] - a3)){
                        continue;
                    }
                    if((grid[0][2] - a1 != grid[1][2] - a2) || (grid[1][2] - a2 != grid[2][2] - a3)){
                        continue;
                    }
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
	}
}