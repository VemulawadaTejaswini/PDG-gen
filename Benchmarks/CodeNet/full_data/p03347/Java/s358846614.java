import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N+1];
        for(int i = 1; i <= N; i++)
            A[i] = sc.nextInt();
        A[0] = -1;
        sc.close();

        int ans = 0;
        for(int i = N; i >= 1; i--){
            if(A[i] > A[i-1]+1){
                ans = -1;
                break;
            } else {
                if(A[i] == A[i-1]+1 && i!=1)
                    ans++;
                else
                    ans += A[i];
            }
        }
        System.out.println(ans);
    }
}