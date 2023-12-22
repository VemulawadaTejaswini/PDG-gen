import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();
        int V = sc.nextInt();
        int P = sc.nextInt();
        long A[] = new long[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextLong();
        }
        Arrays.parallelSort(A);
        
        long aTotal = 0;
        for(int i = 0; i < N - P; i++){
            aTotal += A[i];
        }
        
        if(N - P - 1 == 0){
            System.out.println(P + (A[1] <= A[0] + M ? 1 : 0));
        }else{
            long result = 0;
            for(int i = 0; i < N - P; i++){
                long totalTmp = aTotal - A[i];
                if(A[N - P] <= A[i] + M){
                    long tmp1 = (totalTmp + (V - 1 - (P - 1)) * M);
                    long tmp2 = tmp1 / (N - P - 1);
                    if(tmp2 * (N - P - 1) < tmp1){
                        tmp2++;
                    }
                    if(tmp2 <= A[i] + M){
                        result++;
                    }
                }
            }
            System.out.println(result + P);
        }
        
    }
}
