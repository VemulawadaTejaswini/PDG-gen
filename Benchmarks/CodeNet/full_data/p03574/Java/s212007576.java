import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] board = new char[H][W];
		for(int i = 0; i < H; i++){
			board[i] = sc.next().toCharArray();
		}
		
		
		
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				if(board[i][j] == '#') System.out.print("#");
				else{
					int sum = 0;
					int[] dir = {-1, -1, -1, 0, 1, 1, 1, 0, -1, -1};
					for(int k = 0; k < 8; k++){
						if(i + dir[k] < 0 || i + dir[k] >= H) continue;
						if(j + dir[k + 2] < 0 || j + dir[k + 2] >= W) continue;
						if(board[i + dir[k]][j + dir[k + 2]] == '#') sum++;
					}
					System.out.print(sum);
				}
			}
			System.out.println();
		}
			 
	}
}