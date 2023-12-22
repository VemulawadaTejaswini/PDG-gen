import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] A = new long[N];
        int[] B = new int[N];
        
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        HashMap<Long, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            if(map.containsKey(A[i])){
                map.put(A[i], map.get(A[i]) + B[i]);
            } else{
                map.put(A[i], B[i]);
            }
        }
        Arrays.sort(A);
        for(int i = 0; i < N-1; i++){
            if(A[i] == A[i+1]){
                A[i] = 0;
            }
        }
        int sum = 0;
        long charge = 0;
        int i = 0;
        while(sum < M) {
            if(A[i] != 0) {
                if(M - sum >= map.get(A[i])){
                    sum += map.get(A[i]);
                    charge += map.get(A[i])*A[i];
                } else {
                    charge += (M-sum)*A[i];
                    sum = M;                    
                }
            }
            i++;    
        }
        sc.close();
        System.out.println(charge);
    }
}
