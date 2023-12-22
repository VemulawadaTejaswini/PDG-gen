import java.util.*;
import java.io.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        int[] B = new int[N];
        int result = 0;
        for(int i=0; i<=N; i++){
          A[i]=sc.nextInt();
        }
        for(int i=0; i<N; i++){
          B[i]=sc.nextInt();
        }
        for(int i=0; i<N; i++){
           int d1 = Math.min(A[i], B[i]);
           result += d1;
           A[i] -= d1;
           B[i] -= d1;

           int d2 = Math.min(A[i+1], B[i]);
           result += d2;
           A[i+1] -= d2;
           B[i] -= d2;
        }
        System.out.println(result);
    }
}