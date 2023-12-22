import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int[] P = new int[N];
        int[] A = new int[Q];

        if(K>Q){
            for(int i=0; i<N; i++){
                System.out.println("Yes");
            }
        }
        else if(K<=Q){
            for(int i=0; i<Q; i++){
                A[i] = sc.nextInt();
                P[A[i]-1] += 1;
            }
            for(int i=0; i<N; i++){
                if(P[i]>Q-K){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }

    }
}