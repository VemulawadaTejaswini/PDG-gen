import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int[] X = new int[N+1];
        X[0] = 0;
        K++;
        for(int i = 1; i <= N; i++){
            int x = sc.nextInt();
            if(x == 0){
                K--;
            }else{
                X[i] = x;
            }
        }
        Arrays.sort(X);
        
        long ans = Long.MAX_VALUE;
        for(int l = 0; l < N; l++){
            int r = K-1+l;
            if( r >= N ) break;     
            if( X[l] > 0 ) break;            
            if( X[r] < 0 ) continue;
            
            int left = Math.abs(X[l]);
            int right = Math.abs(X[r]);
            long min = Math.min( left * 2 + right, left + right * 2 );
            ans = Math.min(ans, min);
        }
        
        System.out.println(ans);
    }
}
