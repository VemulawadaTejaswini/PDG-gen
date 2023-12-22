
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static final int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        int N = nint();
        int pow = (int) Math.pow(2, N);
        int[] S = nints(pow); 
        Arrays.sort(S);
        
        int[] a = new int[pow];
        a[pow-1] = S[pow-1];
        S[pow-1] = INF;
        
        for (int n = 1; n <= N; n++) {
            
            int is = pow-1;
            for (int ib = 0, ia = pow-1; ib < (int) Math.pow(2, n-1); ib++, ia--) {
                while (0 <= is && a[ia] <= S[is]) {
                    is--;
                }
                if (is == -1 && Arrays.stream(S).anyMatch(i -> i != INF)) {
                    System.out.println("No");
                    return;
                }
                a[ib] = S[is];
                S[is] = INF;
            }
            Arrays.sort(a);
        }
        System.out.println("Yes");
    }
    
    private static int nint() {
        return sc.nextInt();
    }

    private static int[] nints(int n) {
        return nints(n, 0, 0);
    }

    private static int[] nints(int n, int padL, int padR) {
        int[] a = new int[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nint();
        return a;
    }
}
