import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(), T = sc.nextInt();
        int[] A = new int[T];
        for (int i=0;i<T;i++){
            A[i] = sc.nextInt();
        }
        int M = A[0];
        for (int i=1;i<T;i++){
            M = Math.abs(M-A[i]);
            A[i] = M;
        }
        System.out.println(A[T-1]-1);
    }
}