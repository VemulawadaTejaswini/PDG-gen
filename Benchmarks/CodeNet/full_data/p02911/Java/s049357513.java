import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int[]A = new int[Q];
        for(int i = 0; i < Q; i++) A[i] = sc.nextInt();

        for(int n = 1; n <= N; n++){
int count = K;

        for(int i = 0; i < Q; i++){
            if(A[i] != n) count = count - 1; 
        }
        if(count > 0) System.out.println("Yes");
        else System.out.println("No");
    }


    }
} 