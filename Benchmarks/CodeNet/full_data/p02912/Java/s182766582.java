import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        double A[] = new double[N];
        int a = 0;
        for ( int i = 0; i < N; i++ ){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        for ( int j = 0; j < M; j++ ){
            A[N-1] = A[N-1]/2.0;
            if ( A[N-1] < A[N-2] ){
                Arrays.sort(A);
            }
        }
        for ( int i = 0; i < N; i++ ){
            a += (int)A[i];            
        }
        System.out.println(a);
    }
}