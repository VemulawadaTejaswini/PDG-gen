/*
　　　　　　 ＿＿
　　　　　／＞　　 フ
　　　　　|   _　 _l  
　 　　　／` ミ＿x ノ   Zzz..
　　 　 /　 　 　 |   コード見ちゃだめ！！
　　　 /　 ヽ　　  ﾉ   
　 　 │　　|　|  |   
　／￣|　　 |　|  |
　| (￣ヽ＿_ヽ_)_ _)
　＼二つ
*/

import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        
        long min=1000000000;
        for(long i=1;i*i<=n;i++){
            if(n%i==0){
                long now=Math.max(String.valueOf(i).length(),String.valueOf(n/i).length());
                min=Math.min(min,now);
            }
        }
        System.out.println(min);
    }
}