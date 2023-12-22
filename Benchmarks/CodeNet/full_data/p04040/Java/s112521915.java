/*
 * 縦 H マス、横 W マスのマス目があります。 いろはちゃんは、今一番左上のマス目にいます。 そして、右か下に1マス移動することを繰り返し、一番右下のマス目へと移動します。 
 * ただし、下から A 個以内、かつ左から B 個以内のマス目へは移動することは出来ません。
 * 
 * 移動する方法は何通りあるか求めてください。
 * 
 * なお、答えは非常に大きくなることがあるので、答えは 10^9+7 で割ったあまりを出力してください。
 */

import java.util.*;
	public class Main{
		public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // 入力
            int h = Integer.parseInt(sc.next());
            int w = Integer.parseInt(sc.next());
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            
            long[] dp = new long[w];
            
            for(int i=0; i<w; i++){
            	dp[i] = 1;
            }
            
            for(int i=1; i<h-a; i++){
            	for(int j=1; j<w; j++){
            		dp[j] = (dp[j] + dp[j-1]) % (long)(Math.pow(10, 9) + 7);
            	}
            }
            
            for(int i=h-a; i<h; i++){
            	for(int j=b+1; j<w; j++){
            		dp[j] = (dp[j] + dp[j-1]) % (long)(Math.pow(10, 9) + 7);
            	}
            }
            
            // 出力
            System.out.println(dp[w-1]);

            sc.close();
		}
	}
	