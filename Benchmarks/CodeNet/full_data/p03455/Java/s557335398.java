/*
 * シカのAtCoDeerくんは二つの正整数 a,b を見つけました。 a と b の積が偶数か奇数か判定してください。
 */

import java.util.*;
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // 入力
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            // 出力
            if((a*b)%2==0){
            	System.out.println("Even");
            }else{
            	System.out.println("Odd");
            }
            sc.close();
        }
    }
	