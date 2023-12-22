import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N-1];
        for(int i = 0; i < N-1; i++)B[i] = sc.nextInt();

        for(int i = 0; i < N; i++){
            A[i] = Math.min(B[i],B[i-1]);
        }
        int sum = 0;
        for(int i = 0; i < N; i++) sum += A[i];
        System.out.println(sum);
    }
}