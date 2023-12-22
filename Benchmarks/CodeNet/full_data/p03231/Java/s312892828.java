import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        int k = N*M/(gcd(N,M));
        int NtoM = k/N;
        int MtoN = k/M;
        for (int i = 1; MtoN*i < S.length() && NtoM*i < T.length(); i++) {
            if (S.charAt(MtoN*i) != T.charAt(NtoM*i)) {
                System.out.println(-1);
                return;
            }
        }
        
        System.out.println(k);
    }
    
    private static int gcd(int a, int b) {
        int tmp = a % b;
        int ans = 0;
        if (tmp == 0) {
            ans = b;
        } else {
            ans = gcd(b, tmp);
        }
        return ans;
    }
    
}
