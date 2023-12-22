import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    static final int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        int N = nint();
        int pow = (int) Math.pow(2, N);
        int[] S = nints(pow); 
        sortR(S);
        
        int[] a = {S[0]};
        S[0] = INF;
        
        for (int n = 1; n <= N; n++) {
            int[] b = new int[pow(2, n-1)];
            
            int is = 0;
            for (int ib = 0, ia = 0; ib < b.length; ib++, ia++) {
                while (is < pow && a[ia] <= S[is]) {
                    is++;
                }
                if (is == pow && Arrays.stream(S).anyMatch(i -> i != INF)) {
                    System.out.println("No");
                    return;
                }
                b[ib] = S[is];
                S[is] = INF;
            }
            a = merge(a, b);
            sortR(a);
        }
        System.out.println("Yes");
    }
    static void sortR(int[] a) {
        Arrays.sort(a);
        for (int l = 0, r = a.length-1;  l <= r; l++, r--) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
        }
    }
    
    static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }
    
    public static int pow(int a, int b) {
        return (int) Math.pow(a, b);    
    }

    private static long nlong() {
        return sc.nextLong();
    }

    private static int nint() {
        return sc.nextInt();
    }

    private static String nstr() {
        return sc.next();
    }

    private static char[] nchars() {
        return sc.next().toCharArray();
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

    private static char[][] nchars2(int h, int w) {
        return nchars2(h, w, 0);
    }

    private static char[][] nchars2(int h, int w, int pad) {
        char[][] a2 = new char[h + pad * 2][w + pad * 2];
        for (int i = 0; i < h; i++)
            System.arraycopy(nchars(), 0, a2[pad + i], pad, w);
        return a2;
    }
}
