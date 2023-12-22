import java.util.*;

public class Main {   
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        int K = stdIn.nextInt();
        int N = stdIn.nextInt();
        int[] A = new int[N];

        for (int i=0; i < N; i++){
            A[i] = stdIn.nextInt();
            //System.out.print(A[i]+" ");
        }
        
        int flg = 0;
        int max_N = 0;
        int max = K-(A[N-1] - A[0]);
        //System.out.println("\nmax:"+max);
        for (int i=0; i < N-1; i++) {
            if(max < A[i+1] - A[i]){
                max_N = i ;
                flg = 1;
            }
        }

        int min_K = 0;
        if(flg == 1){
            min_K = K - (A[max_N +1] - A[max_N]);
            //Sysem.out.print(min_K)
        }else{
            min_K = A[N-1] - A[0];
        }
        System.out.print(min_K);


    }

}