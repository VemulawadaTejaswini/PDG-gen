import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int[] L = new int[N];
        int[] R = new int[N];
        int[] M = new int[N];

        for(int i = 0; i < N; i++){
            if(i == 0)
                L[i] = A[0];
            else
                L[i] = gcd(A[i], L[i-1]);
        }
        for(int i = N-1; i >= 0; i--){
            if(i == N-1)
                R[i] = A[N-1];
            else
                R[i] = gcd(A[i], R[i+1]);
        }
        for(int i = 0; i < N; i++){
            if(i == 0)
                M[i] = R[1];
            if(i == N-1)
                M[i] = L[N-2];
            if(i!= 0 && i!=N-1)
                M[i] = gcd(L[i-1], R[i+1]);
        }
        int max = M[0];
        for(int i = 1; i < N; i++){
            max = Math.max(max, M[i]);
        }
        sc.close();
        System.out.println(max);
    }

    static int gcd(int a, int b){
        if(b > a){
           return gcd(b, a);
        }
        if(b == 0)
            return a;
        else
            return gcd(b, a%b);
    }
}
