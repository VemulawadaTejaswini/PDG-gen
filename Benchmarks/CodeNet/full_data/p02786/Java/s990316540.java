import java.util.*;

class Main {
    static long[] memo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        int N = (int)H;
        long tmp = 1;
        int count = 0;
        memo = new long[N];
        memo[0] = 0;
        memo[1] = 1;
        while(tmp != 0) {
            tmp = H/2;
            count++;
        }
        long ans = calc(count);

        System.out.println(ans);
    }
    public static long calc(int n){
        //memo[n]が0じゃなければreturn
        if (memo[n] != 0) return memo[n];
        //memo[n]が0だった場合は以下の処理
        if (n == 0) return 0;
        if (n == 1) return 1;
        long ans = 0;
        ans += calc(n-1) + calc(n-1);
        //呼び直しを起こさないようmemo[n]に値を格納
        memo[n] = ans;
        return ans;
    }
}