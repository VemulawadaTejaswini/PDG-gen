import java.io.*;
import java.util.*;

class Main{
    static boolean dp[] = new boolean[(int)1e5+10];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        dp[0] = true;
        for(int i = 0 ; i < s.length(); i++){
            if(!dp[i])continue;
            if(i+5<=s.length()&&s.substring(i,i+5).equals("dream"))
                dp[i+5] = true;
            if(i+7<=s.length()&&s.substring(i,i+7).equals("dreamer"))
                dp[i+7] = true;
            if(i+5<=s.length()&&s.substring(i,i+5).equals("erase"))
                dp[i+5] = true;
            if(i+7<=s.length()&&s.substring(i,i+7).equals("eraser"))
                dp[i+7] = true;
        }

        if(dp[s.length()])
            System.out.println("YES");
        else System.out.println("NO");
    }
}