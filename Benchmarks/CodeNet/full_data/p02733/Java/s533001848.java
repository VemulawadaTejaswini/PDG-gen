import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int K = sc.nextInt();
		int[][] grid = new int[h][w];
		for(int i = 0; i < h; i++){
		    String s = sc.next();
		    for(int j = 0; j < w; j++){
		        grid[i][j] = s.charAt(j) - '0';
		    }
		}
		
		// 計算
		int result = Integer.MAX_VALUE;
		
		loop:
		for(int i = 0; i < 1<<(h-1); i++){
		    int cnt = Integer.bitCount(i);
		    int[] gid = new int[h];
		    for(int j = 0; j < h-1; j++){
		        if((i>>j & 1) == 1){
		            gid[j+1] = gid[j] + 1;
		        }else{
		            gid[j+1] = gid[j];
		        }
		    }
		    int[][] ggrid = new int[cnt+1][w];
		    for(int j = 0; j < h; j++){
		        for(int k = 0; k < w; k++){
		            ggrid[gid[j]][k] += grid[j][k];
		        }
		    }
		    int[] gsum = new int[cnt+1];
		    int tmp = cnt;
		    for(int j = 0; j < w; j++){
		        boolean flg = false;
		        for(int k = 0; k < cnt+1; k++){
		            if(ggrid[k][j] > K) continue loop;
		            if(gsum[k]+ggrid[k][j] > K) flg = true;
		        }
		        if(flg){
		            tmp++;
		            Arrays.fill(gsum, 0);
		        }
		        for(int k = 0; k < cnt+1; k++){
		            gsum[k] += ggrid[k][j];
		        }
		    }
		    
		    result = min(result, tmp);
		}
		
		// 出力
		System.out.println(result);
		
	}
}
