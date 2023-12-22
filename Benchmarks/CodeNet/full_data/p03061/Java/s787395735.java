import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] L = new int[N + 1];
        int[] R = new int[N + 1];
        L[0] = 0;
        R[N] = 0;

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            if(i==0){
                L[i + 1] = A[i];
                continue;
            }
            L[i + 1] = getCommonDivisor(L[i], A[i]);
        }
        for(int i=N-1; i>=0; i--){
            if(i==N-1){
                R[i] = A[i];
                continue;
            }
            R[i] = getCommonDivisor(R[i+1], A[i]);
        }
        int max = 0;
        for(int i=0; i<N; i++){
            if(i==0){
                max = Math.max(max, R[i + 1]);
                continue;
            }
            if(i==N-1){
                max = Math.max(max, L[i]);
                continue;
            }
            max = Math.max(max, getCommonDivisor(L[i], R[i + 1]));
        }
        System.out.println(max);
    }

    

    private static int getCommonDivisor(int x, int y){
        int bigger = Math.max(x, y);
        int smaller = Math.min(x, y);
        int surplus = bigger % smaller;
        
        if(surplus==0){
            return smaller;
        }
        surplus = getCommonDivisor(smaller, surplus);

        return surplus;
    }
}