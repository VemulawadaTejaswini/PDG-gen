import java.io.*;
import java.util.*;


public class Main {
    static int n,A,B,C,D;
    static char[] s;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        n = sc.nextInt(); A = sc.nextInt()-1;
        B = sc.nextInt()-1; C = sc.nextInt()-1; D = sc.nextInt()-1;
        s = sc.next().toCharArray();
        String ans = help()?"Yes":"No";
        System.out.println(ans);
    }
    static boolean help(){
        if(C<B&&B<D){ //A<C<B<D
            return check(A,C)&&check(B,D);
        } else if(B<C&&C<D){
            return check(B,D)&&check(A,C);
        } else{ // A<B<D<C
            if(!check(A,C)||!check(B,D)) return false;
            for(int i=B;i<=D;i++){
                if(s[i-1]!='#'&&s[i]!='#'&&s[i+1]!='#') return true;
            }
            return false;
        }
    }
    static boolean check(int start, int end){
        boolean[] dp = new boolean[n];
        dp[start] = true;
        for(int i=start+1;i<=end;i++){
            if(s[i]=='#') continue;
            dp[i] |= dp[i-1];
            if(i>=start+2) dp[i] |= dp[i-2];
        }
        return dp[end];
    }
}

