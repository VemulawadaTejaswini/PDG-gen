import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int len = S.length();
        final int Mod = 1000000000+7;
        int[] A = new int[123456];
        int[] AB = new int[123456];
        int[] dp = new int[123456];
        for(int i=1;i<=len;i++){
            if(S.charAt(i-1)=='A'){
                AB[i] = AB[i-1];
                dp[i] = dp[i-1];
                A[i] = (A[i-1]+1)%Mod;
            }
            else if(S.charAt(i-1)=='B'){
                A[i] = A[i-1];
                dp[i] = dp[i-1];
                AB[i] = (AB[i-1] + A[i-1])%Mod;
            }
            else if(S.charAt(i-1)=='C'){
                A[i] = A[i-1];
                AB[i] = AB[i-1];
                dp[i] = (dp[i-1]+AB[i-1])%Mod;
            }
            else{ // charAt == '?'
                A[i] = (A[i-1]+1)%Mod;
                AB[i] = (AB[i-1] + A[i-1])%Mod;
                dp[i] = (dp[i-1]+AB[i-1])%Mod;
            }
        }
        int ans = dp[len];
        System.out.println(ans);
    }
}
