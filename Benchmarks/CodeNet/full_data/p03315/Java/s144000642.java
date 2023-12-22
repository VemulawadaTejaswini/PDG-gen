// 2019/07/12
// AtCoder Beginner Contest 101 - A

import java.util.*;
public class Main {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        // Input
        String s = sc.next();
        int ans = 0;
        for(int i=0; i<4; i++){
            if(s.charAt(i)=='+'){
                ans++;
            } else {
                ans--;
            }
        }
        // Output
        System.out.println(ans);
    }
}