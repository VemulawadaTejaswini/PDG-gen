import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();

        int[] B = new int[M];
        for(int m=0; m<M; m++) B[m]=sc.nextInt();

        int ans = 0;
        for(int n=0; n<N; n++){
            int[] A = new int[M];
            for(int m=0; m<M; m++) A[m]=sc.nextInt();

            int codeQuality = C;
            for(int m=0; m<M; m++) codeQuality += A[m]*B[m];
            if(codeQuality>0) ans++;
        }
        System.out.println(ans);



    }
}