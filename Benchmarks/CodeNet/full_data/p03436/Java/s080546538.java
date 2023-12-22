import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*
 * メモ
 * Scanner:nextは空白か改行までの単語
 * String[][] c = new String[h][w];
 * TemplateMain,"template_input.txt"
 * 0.5 == 1.0/2
 * Integer.valueOf(char)はダメ、(String)
 */

public class Main {
	
	public static void printlnYN(boolean b){
		System.out.println(b?"Yes":"No");
	}

	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
 
    	int H = sc.nextInt();
    	int W = sc.nextInt();
    	int sy = 0;
    	int sx = 0;
    	int gy = H-1;
    	int gx = W-1;
    	String[][] map = new String[H][W];
    	boolean[][] check = new boolean[H][W];
    	int siros = 0;
    	for(int i = 0; i < H; i++){
    		String line = sc.next();
    		for(int j = 0; j < W; j++){
    			map[i][j] = String.valueOf(line.charAt(j));
    			if(map[i][j].equals(".")) siros++;
    			check[i][j] = false;
    		}
    	}
    	
    	Deque que = new ArrayDeque<int[]>();
    	int[] start = {sy, sx, 0};
    	que.addLast(start);
    	
    	int ans = -1;
    	
    	while(true){
    		int[] p = (int[])que.pollFirst();
    		if(p == null) break;
    		
    		int y = p[0];
    		int x = p[1];
    		int count = p[2];
    		
    		if(y == gy && x == gx){
    			ans = count;
    			break;
    		}
    		
    		if(y-1 >= 0 && map[y-1][x].equals(".") && !check[y-1][x]){
    			check[y-1][x] = true;
    			int[] next = {y-1, x, count+1};
    			que.addLast(next);
    		}
    		
    		if(y+1 < H && map[y+1][x].equals(".") && !check[y+1][x]){
    			check[y+1][x] = true;
    			int[] next = {y+1, x, count+1};
    			que.addLast(next);
    		}
    		
    		if(x-1 >= 0 && map[y][x-1].equals(".") && !check[y][x-1]){
    			check[y][x-1] = true;
    			int[] next = {y, x-1, count+1};
    			que.addLast(next);
    		}
    		
    		if(x+1 < W && map[y][x+1].equals(".") && !check[y][x+1]){
    			check[y][x+1] = true;
    			int[] next = {y, x+1, count+1};
    			que.addLast(next);
    		}
    	}
    	
    	if(ans == -1) System.out.println(-1);
    	System.out.println((siros-ans-1));
    	
    	
	}
}