import java.util.*;

public class Main{

    static int N;
    static int M;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        sc.close();

        long inc = 0;
        for(int i = M-1; i >= 0; i--){
            if(max_index(i, A, B) == -1)
                continue;
            else{
                inc += B[max_index(i, A, B)];
                B[max_index(i, A, B)] = -1;
            }
        }
        System.out.println(inc);
    }

    static int max_index(int day, int[] A, int[] B){
        int index = -1;
        int max = 0;
        for(int i = 0; i < A.length; i++){
            if (A[i] <= M-day && max < B[i]){
                max = B[i];
                index = i;
            }
        }
        return index;
    }
}
