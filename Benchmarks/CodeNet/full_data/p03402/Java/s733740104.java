import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 計算
		int h = 100;
		int w = 100;
		char[][] grid = new char[h][w];
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        if(i > 49){
		            grid[i][j] = '.';
		        }else{
		            grid[i][j] = '#';
		        }
		    }
		}
		for(int i = 0; i < 49; i++){
		    for(int j = 0; j < w; j++){
		        if(a < 1) break;
		        if(i%2 == 0 && j%2 == 0){
		            grid[i][j] = '.';
		            a--;
		        }
		    }
		    if(a < 1) break;
		}
		for(int i = 51; i < h; i++){
		    for(int j = 0; j < w; j++){
		        if(b < 1) break;
		        if(i%2 == 0 && j%2 == 0){
		            grid[i][j] = '#';
		            b--;
		        }
		    }
		    if(b < 1) break;
		}
		
		// 出力
		System.out.println(h + " " + w);
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        System.out.print(grid[i][j]);
		    }
		    System.out.println("");
		}
		
	}
}


