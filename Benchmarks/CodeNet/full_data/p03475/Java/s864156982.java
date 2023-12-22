import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;

public class Main {
    static int nextMultiple(int min, int M){
        int ans = (min/M)*M;
        while(ans<min) ans += M;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] C = new int[N];
        int[] S = new int[N];
        int[] F = new int[N];
        for(int n=0; n<N-1; n++){
            C[n] = sc.nextInt();
            S[n] = sc.nextInt();
            F[n] = sc.nextInt();
        }
        for(int start=0; start<=N-1; start++){
            int time = 0;
            for(int n=start; n<N-1; n++){
                time = Math.max(S[n], nextMultiple(time, F[n])) + C[n];
            }
            System.out.println(time);
        }

    }
}
