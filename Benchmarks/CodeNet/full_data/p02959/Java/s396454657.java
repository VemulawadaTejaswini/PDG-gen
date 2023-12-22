import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N+1];
        long[] B = new long[N];
        for(int n=0; n<=N; n++) A[n]=sc.nextLong();
        for(int n=0; n<N; n++) B[n]=sc.nextLong();
        long defeat = 0;
        for(int n=0; n<N; n++){
            long d1 = Math.min(A[n], B[n]);
            defeat += d1;
            A[n] -= d1;
            B[n] -= d1;

            long d2 = Math.min(A[n+1], B[n]);
            defeat += d2;
            A[n+1] -= d2;
            B[n] -= d2;
        }
        System.out.println(defeat);
    }
}