/*
 * あなたは、500 円玉を A 枚、100 円玉を B 枚、50 円玉を C 枚持っています。 これらの硬貨の中から何枚かを選び、合計金額をちょうど X 円にする方法は何通りありますか。
 * 
 * 同じ種類の硬貨どうしは区別できません。2 通りの硬貨の選び方は、ある種類の硬貨についてその硬貨を選ぶ枚数が異なるとき区別されます。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            
            int aa = x/500;
            int counter = 0;
            
            for(int i=0; i<=Math.min(aa,a); i++){
            	for(int j=0; j<=Math.min((x-i*500)/100, b); j++){
            		if((x - i*500 - j*100)%50 == 0 && (x - i*500 - j*100)/50 <=c){
            			counter++;
            		}
            	}
            }
            
            //出力
            System.out.println(counter);
            sc.close();
        }
    }
	