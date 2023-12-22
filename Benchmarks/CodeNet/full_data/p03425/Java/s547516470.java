/*
 * N 人の人がいて、i 番目の人の名前は Si です。
 * 
 * この中から、以下の条件を満たすように 3 人を選びたいです。
 * 
 *     全ての人の名前が M,A,R,C,H のどれかから始まっている
 *     同じ文字から始まる名前を持つ人が複数いない
 * 
 * これらの条件を満たすように 3 人を選ぶ方法が何通りあるか、求めてください。ただし、選ぶ順番は考えません。
 * 
 * 答えが 32 bit整数型に収まらない場合に注意してください。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // 入力
            int n = Integer.parseInt(sc.next());
            long[] counter = new long[5];
            for(int i=0; i<5; i++){
            	counter[i] = 0;
            }
            
            for(int i=0; i<n; i++){
            	// 文字列の入力
                String a = sc.next();
                if(a.substring(0,1).equals("M")){
                	counter[0]++;
                }
                else if(a.substring(0,1).equals("A")){
                	counter[1]++;
                }
                else if(a.substring(0,1).equals("R")){
                	counter[2]++;
                }
                else if(a.substring(0,1).equals("C")){
                	counter[3]++;
                }
                else if(a.substring(0,1).equals("H")){
                	counter[4]++;
                }
            }
            long ret = counter[0] * counter[1] * counter[2]
            			+ counter[0] * counter[1] * counter[3]
            					+ counter[0] * counter[1] * counter[4]
            							+ counter[0] * counter[2] * counter[3]
            									+ counter[0] * counter[2] * counter[4]
            											+ counter[0] * counter[3] * counter[4]
            													+ counter[1] * counter[2] * counter[3]
            															+ counter[1] * counter[2] * counter[4]
            																	+ counter[1] * counter[3] * counter[4]
            																			+ counter[2] * counter[3] * counter[4];
            // 出力
            System.out.println(ret);
            
            sc.close();
        }
    }
