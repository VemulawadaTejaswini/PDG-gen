import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N+1];
        int[] B = new int[N];

        int Bmax = -1;
        int BmaxIndex = -1;

        for(int i=0; i<N+1; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            B[i] = sc.nextInt();
            if(Bmax < B[i]){
                Bmax = B[i];
                BmaxIndex = i;
            }
        }

        int destroyed = 0;

        destroyed += destroy(A, B, BmaxIndex);

        for(int i= BmaxIndex-1; i>=0; i--){
            destroyed += destroy(A, B, i);
        }

        for(int i= BmaxIndex+1; i<N; i++){
            destroyed += destroy(A, B, i);
        }

        System.out.println(destroyed);

    }

    public static int destroy(int[] A, int[] B, int i){
        int destroyed = 0;

        int killable = B[i];
        if(A[i] < killable){
            destroyed += A[i];
            killable -= A[i];
            A[i] = 0;
            if(A[i+1] < killable){
                destroyed += A[i+1];
                A[i+1] = 0;
            }else{
                destroyed += killable;
                A[i+1] -= killable;
            }
        }else {
            destroyed += killable;
        }

        return destroyed;
    }
}