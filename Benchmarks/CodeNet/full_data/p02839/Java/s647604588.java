import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] gridA = new int[h][w];
		int[][] gridB = new int[h][w];
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        gridA[i][j] = sc.nextInt();
		    }
		}
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        gridB[i][j] = sc.nextInt();
		    }
		}
		int[][] gridAbs = new int[h][w];
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        gridAbs[i][j] = abs(gridA[i][j] - gridB[i][j]);
		    }
		}
		
		// 計算
		int result = 0;
		boolean[][][] dp = new boolean[h][w][100*160];
		dp[0][0][gridAbs[0][0]] = true;
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        for(int k = 0; k < 100*160; k++){
		            if(dp[i][j][k]){
		                if(i < h-1) dp[i+1][j][k + gridAbs[i+1][j]] = true;
		                if(i < h-1) dp[i+1][j][abs(k - gridAbs[i+1][j])] = true;
		                if(j < w-1) dp[i][j+1][k + gridAbs[i][j+1]] = true;
		                if(j < w-1) dp[i][j+1][abs(k - gridAbs[i][j+1])] = true;
		            }
		        }
		    }
		}
		for(int k = 0; k < 100*160; k++){
		    if(dp[h-1][w-1][k]){
		        result = k;
		        break;
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}
