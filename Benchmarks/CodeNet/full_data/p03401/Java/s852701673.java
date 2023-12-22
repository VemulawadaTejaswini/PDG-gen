import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+2];
        int[] sum = new int[N];
        A[0] = 0;
        A[N+1] = 0;

        for(int i1 = 1; i1 < N+1; i1++){
            A[i1] = sc.nextInt();
        }

        for(int i3  = 0; i3 < N; i3++){
            for(int i4 = 0; i4 < N+1; i4++){
                sum[i3] = sum[i3] + Math.abs(A[i4+1] - A[i4]);
            }
        }

        for(int i5 = 0; i5 < N; i5++){
            if((A[i5 + 1] - A[i5])*(A[i5 + 1] - A[i5 + 2]) <= 0){
                System.out.println(sum[i5]);
            }else{

                sum[i5] = sum[i5] - Math.abs(Math.abs(A[i5] - A[i5 + 2]) - Math.abs(A[i5] - A[i5 + 1]))*2;
                System.out.println(sum[i5]);
            }
        }
    }
}