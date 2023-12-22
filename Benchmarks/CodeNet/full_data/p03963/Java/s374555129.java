import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long ans = 1;
        
        for(int i=1; i<=N-1; i++){
            ans *= K-1; 
        }
        
        ans = K*ans;
        
        System.out.println(ans);
        
    }
}
