/*
 * x 軸上に N 個の観光スポットがあり、1,2,…,N の番号がついています。 観光スポット i は座標 Ai の点にあります。 また、x 軸上を座標 a の点から座標 b の点まで移動するには |a−b| 円かかります。
 * 
 * あなたは x 軸上を旅行する計画を立てました。 計画では、最初に座標 0 の点を出発し、N 個の観光スポットを番号順に訪れ、最後に座標 0 の点に戻ってくることになっています。
 * 
 * ところが、旅行の直前に急用が入り、N 個すべての観光スポットを訪れる時間的余裕がなくなってしまいました。 そこで、ある i を選び、観光スポット i を訪れるのを取りやめることにしました。
 * それ以外の観光スポットは予定通り番号順に訪れます。 また、最初に座標 0 の点を出発し、最後に座標 0 の点に戻ってくることについても、予定に変更はありません。
 * 
 * i=1,2,…,N それぞれについて、観光スポット i を訪れるのを取りやめたときの、旅行中の移動にかかる金額の総和を求めてください。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            // 観光スポットのx座標の配列
            long[] points = new long[n+2];
            // すべてのスポットを回ったときの総距離
            long sum = 0;
            points[0] = 0;
            points[n+1] = 0;
            
            // points, sumの初期化
            for(int i=1; i<n+1; i++){
            	points[i] = Long.parseLong(sc.next());
            	sum += Math.abs(points[i-1] - points[i]);
            }
            sum += Math.abs(points[n]);
            
            //出力
            for(int i=1; i<n+1; i++){ // 各ポイントについてそこに行かなかった場合の距離を出力
            	System.out.println(sum - Math.abs(points[i] - points[i-1]) - Math.abs(points[i] - points[i+1]) + Math.abs(points[i+1] - points[i-1]));
            }
            sc.close();
        }
    }
