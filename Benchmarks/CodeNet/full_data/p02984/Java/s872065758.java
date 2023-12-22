import java.util.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        long s = 0;

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            s += A[i];
        }
        
        for(int i=1; i<N-1; i=i+2){
            s -= 2 * A[i];
        }
        long[] B = new long[N];
        B[0] = s;
        System.out.print(B[0]);

        for(int i=1; i<N; i++){
            B[i] = 2 * A[i - 1] - B[i - 1];
            System.out.print(" " + B[i]);
        }
    }
}