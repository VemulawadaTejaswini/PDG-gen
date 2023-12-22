import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int[]A = new int[N];
        for(int i = 0; i < N; i++) A[i] = K-Q;

        for(int i = 0; i < Q; i++){
            int a = sc.nextInt();
            A[a]++; 
        }

        for(int i = 0; i < Q; i++){
        if(A[i] > 0) System.out.println("Yes");
        else System.out.println("No");
    }


    }
} 