import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


    	Scanner sc = new Scanner(System.in);
    	int H = sc.nextInt();
    	int W = sc.nextInt();
    	int[][] board = new int[H][W];
    	int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    	int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};
    	for(int i = 0; i < H; i++){
    		String[] strs = sc.next().split("");
    		for(int j = 0; j < W; j++){
    			board[i][j] = strs[j].equals("#")? 9 : 0;
    		}
    	}
    	for(int i = 0; i < H; i++){
    		for(int j = 0; j < W; j++){
    			if(board[i][j] != 9){
    				int cnt = 0;
        			for(int k = 0; k < 8; k++){
        				int x = i + dx[k];
        				int y = j + dy[k];
        				if(x >= 0 && x < W &&
        						y >= 0 && y < H && board[x][y] == 9){
        					cnt++;
        				}
        			}
        			board[i][j] = cnt;
    			}
    		}
    	}
    	for(int i = 0; i < H; i++){
    		for(int j = 0; j < W; j++){
    			if(board[i][j] == 9){
    				System.out.print("#");
    			}else{
    				System.out.print(board[i][j]);
    			}
    		}
    		System.out.println();
    	}
    }
}
