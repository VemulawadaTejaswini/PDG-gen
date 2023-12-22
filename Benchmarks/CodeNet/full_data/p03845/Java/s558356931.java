import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);

        int N, T[], M, P[], X[], sum;

        sum = 0;
        N = sc.nextInt();
        T = new int[N];
        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt();

            sum += T[i];
        }

        M = sc.nextInt();
        P = new int[M];
        X = new int[M];
        for (int i = 0; i < M; i++) {
            P[i] = sc.nextInt();
            X[i] = sc.nextInt();
        }
        
        for (int i = 0; i < M; i++) {
            out.println(sum - T[P[i]-1] + X[i]);
        }
        sc.close();
    }
}