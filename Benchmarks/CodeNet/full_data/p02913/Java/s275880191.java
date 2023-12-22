import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class Main {
    static final Scanner sc  = new Scanner(System.in);
    static final int MOD = (int) 1E9 + 7;
    static final int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        int N = nint();
        String s = nstr();

        int[] count = new int['z'+1];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        
        if (Arrays.stream(count).allMatch(i -> i <= 1)) {
            System.out.println("0");
            return;
        }
        
        IntUnaryOperator func = 
                x -> N - sub(s.substring(0, x), s.substring(x, N));
        
        int max = ts(func, 0, N);
        System.out.println(sub(s.substring(0, max), s.substring(max, N)) + 1);
    }

    public static int ts(IntUnaryOperator func, int low, int high) {
        for(int i = 0; i < 23; i++){
            int l = (2*low+high) / 3;
            int r = (low+2*high) / 3;
            int tl = func.applyAsInt(l);
            int tr = func.applyAsInt(r);
            if(tl < tr){
                high = r;
            }else{
                low = l;
            }
        }
        return func.applyAsInt(high);
    }

    public static int sub(String a, String b){
        int m = a.length();
        int n = b.length();
     
        int max = 0;
     
        int[][] dp = new int[m][n];
     
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(a.charAt(i) == b.charAt(j)){
                    if(i==0 || j==0){
                        dp[i][j]=1;
                    }else{
                        dp[i][j] = dp[i-1][j-1]+1;
                    }
     
                    if(max < dp[i][j])
                        max = dp[i][j];
                }
     
            }
        }
     
        return max;
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

    private static long nlong() {
        return sc.nextLong();
    }

    private static long[] nlongs(int n) {
        return nlongs(n, 0, 0);
    }

    private static long[] nlongs(int n, int padL, int padR) {
        long[] a = new long[padL + n + padR];
        for (int i = 0; i < n; i++)
            a[padL + i] = nlong();
        return a;
    }

    private static double ndouble() {
        return sc.nextDouble();
    }
    
    private static double[] ndoubles(int n) {
        return ndoubles(n, 0, 0);
    }
    
    private static double[] ndoubles(int n, int padL, int padR) {
        double[] d = new double[n + padL + padR];
        for (int i = 0; i < n; i++) {
            d[padL + i] = ndouble();
        }
        return d;
    }

    private static String nstr() {
        return sc.next();
    }

    private static char[] nchars() {
        return sc.next().toCharArray();
    }

    private static char[] nchars(int padL, int padR) {
        char[] temp = sc.next().toCharArray();
        char[] ret = new char[temp.length + padL + padR];
        System.arraycopy(temp, 0, ret, padL, temp.length);
        return ret;
    }
    
    private static char[][] nchars2(int h, int w) {
        return nchars2(h, w, 0, 0);
    }

    private static char[][] nchars2(int h, int w, int padLU, int padRD) {
        char[][] a2 = new char[h + padLU + padRD][w + padLU + padRD];
        for (int i = 0; i < h; i++)
            System.arraycopy(nchars(), 0, a2[padLU + i], padLU, w);
        return a2;
    }
    
    private static long min(long... ls) {
        return Arrays.stream(ls).min().getAsLong();
    }
    
    private static long max(long... ls) {
        return Arrays.stream(ls).max().getAsLong();
    }
    
    private static long abs(long a, long b) {
        return Math.abs(a - b);
    }
}
