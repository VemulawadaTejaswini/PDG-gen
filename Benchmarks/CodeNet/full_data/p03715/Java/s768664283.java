import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final PrintStream so = System.out;
    static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int H = ni();
        int W = ni();
        if (H % 3 == 0 || W % 3 == 0) {
            so.println(0);
            return;
        }
        
        so.println(Math.min(solve(H, W), solve(W, H)));
    }
    
    static long solve(long H, long W) {
        long min = Long.MAX_VALUE;
        long S = H*W;
        for (int h = 1; h < H; h++) {
            long S1 = h*W;
            long S2 = W/2 * (H-h);
            long S3 = (S-S1) - S2;
            min = Math.min(maxMinusMin(S1, S2, S3), min);
        }
        
        if (H > 3) {
            long minH = H / 3;
            long maxH = minH + 1;
            min = Math.min(min, (maxH - minH)*W);
        }
        
        return min;
    }
    
    static long maxMinusMin(long a1, long a2, long a3) {
        long max = Math.max(a1, Math.max(a2, a3));
        long min = Math.min(a1, Math.min(a2, a3));
        return max - min;
    }
    
    static int ni() {
        return sc.nextInt();
    }
    
    static long nl() {
        return sc.nextLong();
    }

    static char[] nsToChars() {
        return sc.next().toCharArray();
    }
}
