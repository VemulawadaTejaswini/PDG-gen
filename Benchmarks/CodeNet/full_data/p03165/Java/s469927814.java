import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        String s="",t="";
        if(scan.hasNext())
            s=scan.next();
        if(scan.hasNext())
            t=scan.next();
        int[][] dp=new int[s.length()+1][t.length()+1];
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=t.length();j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        String str="";
        int j=t.length(),i=s.length();

            while(j>=1 && i>=1) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    str = s.charAt(i - 1) + str;
                    i--;
                    j--;
                } else{
                    if(dp[i-1][j]>=dp[i][j-1]){
                        i--;
                    }else{
                        j--;
                    }
                }
            }


        System.out.println(str);
    }
}
