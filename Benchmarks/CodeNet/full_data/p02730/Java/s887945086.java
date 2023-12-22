import java.util.*;

import sun.net.www.content.text.plain;

import java.math.*;
public class Main {
    static final int MOD = 1_000_000_007; // 10^9+7
    //static final int MAX = 2_147_483_646; // intの最大値
    static final int INF = 1_000_000_000; // 10^9
    static final int MAX = 10_000_000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] str = s.toCharArray();
        for(int i = 0; i < s.length()/2;i++){
            if(str[i]!=str[str.length-i-1]){
                System.out.println("No");
                return;
            }
        }
        for(int i = 0;i < s.length()/4;i++){
            if(str[i]!=str[str.length/2-i-1]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
                return;
    }       
}




