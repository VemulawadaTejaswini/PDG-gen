/*
 * 2×N のマス目があります。上から i 行目、左から j 列目 (1≤i≤2, 1≤j≤N) のマスをマス (i,j) と表すことにします。
 * 
 * あなたははじめ、左上のマス (1,1) にいます。 あなたは、右方向または下方向への移動を繰り返し、右下のマス (2,N) に移動しようとしています。
 * 
 * マス (i,j) には Ai,j 個のアメが置かれています。 あなたは移動中に通ったマスに置いてあるアメをすべて回収します。 
 * 左上および右下のマスにもアメが置かれており、あなたはこれらのマスに置かれているアメも回収します。
 * 
 * 移動方法をうまく選んだとき、最大で何個のアメを回収できるでしょうか。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            int[][] candies = new int[2][n];
            int[][] dp = new int[2][n];
            
            for(int i=0; i<2*n; i++){
            	candies[i/n][i%n] = Integer.parseInt(sc.next());
            }
            dp[0][0] = candies[0][0];
            dp[1][0] = dp[0][0] + candies[1][0];
            for(int i=1; i<n; i++){
            	dp[0][i] = dp[0][i-1] + candies[0][i];
            	dp[1][i] = candies[1][i] + Math.max(dp[0][i], dp[1][i-1]);
            }
            
            //出力
            System.out.println(dp[1][n-1]);
            sc.close();
        }
    }
	