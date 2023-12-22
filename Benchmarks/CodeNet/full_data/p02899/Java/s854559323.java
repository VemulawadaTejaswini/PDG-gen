import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] A = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                A[i] = sc.nextLong();
        }
        solve(N, A);
    }

    static void solve(long N, long[] A){
        long[] ans = new long[(int)N];

        for (int i = 0; i < N; i++) {
            ans[(int)A[i] - 1] = i + 1;
        }
        String ans2 = "";
        for ( long var : ans) {
            ans2 += Long.toString(var);
            ans2 += " ";
        }
        System.out.println(ans2);
    }
}
