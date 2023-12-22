import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N + 1];
        int[] B = new int[N];
        int ans = 0;

        for(int i=0; i<=N; i++){
            A[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            B[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            if(A[i]>=B[i]){
                ans += B[i];
            }
            else{
                ans += A[i];
                B[i] = B[i] - A[i];
                if(A[i+1]>=B[i]){
                    A[i+1] -= B[i];
                    ans += B[i]; 
                }
                else{
                    ans += A[i+1];
                    A[i+1] = 0;
                }

            }
        }
        System.out.println(ans);
    }
}
