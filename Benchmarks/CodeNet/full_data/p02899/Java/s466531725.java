import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        int[] A = new int[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                A[i] = sc.nextInt();
        }
        solve(N, A);
    }

    static void solve(int N, int[] A){
        int[] ans = new int[(int)N];

        for (int i = 0; i < N; i++) {
            ans[(int)A[i] - 1] = i + 1;
        }

        StringBuilder sb = new StringBuilder();

        for ( int var : ans) {
            sb.append(Long.toString(var));
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
