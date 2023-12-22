import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    static long mod = 1000000000+7;
    static int maxn = 100005;
    static long[] dp = new long[maxn+1];
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        String L = sc.next();
        String s = plusOne(L);
        int len = s.length();
        ArrayList<Integer> one = new ArrayList<>();
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='1') one.add(i);
        }
        dp[0] = 1;
        dp[1] = 3;
        for(int i=2;i<=maxn;i++) dp[i] = 3*dp[i-1]%mod;
        long ans = solve(one,len);
        System.out.println(ans);
    }
    static long solve(ArrayList<Integer> ones,int len){
        // len is the length of L+1 in base-2
        if(ones.size()==1){
            return dp[len-1];
        }
        long ans = dp[len-1];
        for(int i=1;i<ones.size();i++){
            long cur = pow(2,i);
            int x = ones.get(i);
            int remain = len-1-x;
            cur = cur*dp[remain]%mod;
            ans = (ans+cur)%mod;
        }
        return ans;
    }
    static String plusOne(String L){
        int len = L.length();
        int idx = len-1;
        while(idx>=0){
            if(L.charAt(idx)=='0') break;
            idx--;
        }
        StringBuilder sb = new StringBuilder();
        if(idx==-1){
            sb.append(1);
            for(int j=0;j<len;j++) sb.append(0);
        } else{
            sb.append(L.substring(0,idx));
            sb.append(1);
            for(int j=idx+1;j<len;j++) sb.append(0);
        }
        return sb.toString();
    }
    static long pow(long base, long q){
        long ret = 1;
        while(q>0){
            if(q%2==1) ret = ret*base%mod;
            base = base*base%mod;
            q /= 2;
        }
        return ret;
    }
}

