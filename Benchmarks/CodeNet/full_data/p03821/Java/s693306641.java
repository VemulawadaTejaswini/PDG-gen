import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        long push = 0; 
        for (int i = A.length-1; i > -1; i--) {
            long Ai = A[i]+push;
            long Bi = B[i];
            if (Ai%Bi > 0) {
                push += Bi-(Ai%Bi);
            }           
        }
        System.out.println(push);
    }
    
}
