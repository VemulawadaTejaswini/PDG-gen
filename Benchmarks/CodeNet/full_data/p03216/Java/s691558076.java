import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String S = sc.next();
        S = "*"+S;
        char[] s = S.toCharArray();
        int Q = sc.nextInt();
        //int[] k = new int[Q];
        for(int i=0;i<Q;i++){
            int k = sc.nextInt();
            long ans = solve(s,k);
            System.out.println(ans);
        }
    }
    static long solve(char[] s, int k){
        int n = s.length-1;
        long[] D = new long[n+1];
        for(int end=1;end<=n;end++){
            D[end] += D[end-1];
            if(s[end]=='D') D[end]++;
            if(end+2-k>=0&&s[end+2-k]=='D') D[end]--;
        }
        long[] M = new long[n+1];
        for(int end=1;end<=n;end++){
            M[end] += M[end-1];
            if(s[end]=='M') M[end]++;
            if(end+2-k>=0&&s[end+2-k]=='M') M[end]--;
        }
        long[] DM = new long[n+1];
        for(int end=2;end<=n;end++){
            DM[end] += DM[end-1];
            if(s[end]=='M') DM[end] += D[end-1];
            if(end+1-k>=0&&s[end+1-k]=='D') DM[end] -= M[end-1];
        }
        long ans = 0;
        for(int i=3;i<=n;i++){
            if(s[i]=='C') ans += DM[i-1];
        }
        return ans;
    }
}