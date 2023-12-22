import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        
        int A[] = new int[N+1];
        for(int i = 1; i <= M; i++) {
            A[sc.nextInt()] = 1;
        }
        
        int min = Integer.MAX_VALUE;
        
        int right = 0;
        for(int i = X; i <= N; i++) {
            if( A[i] > 0 ) {
                right++;
            }
        }
        min = Math.min(min, right);
        
        int left = 0;
        for(int i = X; 0 <= i; i--) {
            if( A[i] > 0 ) {
                left++;
            }
        }
        min = Math.min(min, left);
        
        System.out.println( min );
        
    }
}
