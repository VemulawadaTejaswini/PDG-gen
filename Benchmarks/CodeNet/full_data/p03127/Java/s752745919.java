import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int gcd = A[0];
        for (int i = 1; i < N; i++) {
            int now = A[i];
            gcd = gcd(gcd, now);
        }
        System.out.println(gcd);
      
    }
    
    private static int gcd(int a, int b) {
        int mod = a%b;
        int ans = 0;
        if (mod != 0) {
             ans = gcd(b, mod);
        } else {
            ans = b;
        }
        return ans;
    }
}
