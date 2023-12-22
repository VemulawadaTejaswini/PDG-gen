import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N + 1];
        int[] B = new int[N];
        long ans = 0;
 
        for(int i=0; i<=N; i++){
            A[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            B[i] = sc.nextInt();
        }
 
        for(int i=0; i<N; i++){
            int x = Math.min(A[i], B[i]);
            ans += x;
            B[i] -= x;
            int y = Math.min(A[i + 1], B[i]);
            ans += y;
            A[i + 1] -= y;
        }
        System.out.println(ans);
    }
}