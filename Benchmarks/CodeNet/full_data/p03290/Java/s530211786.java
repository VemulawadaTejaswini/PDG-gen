import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int g = sc.nextInt();
        
        int[] p = new int[n];
        int[] comp = new int[n];
        int[] maxUnComp = new int[n];
        
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            maxUnComp[i] = 100*(i+1) * (p[i] - 1);
            comp[i] = maxUnComp[i] + 100*(i+1) + sc.nextInt();
        }
        
        int ans = Integer.MAX_VALUE;
        for (int bits = 0; bits < 1 << n; bits++) {
            int sumS = sum(comp, bits, n); // score
            int sumQ = sum(p   , bits, n); // number of questions to solve
            int idx = firstIdxOf0(bits, n);
            int needed = g - sumS;

            if (idx != -1 && needed <= maxUnComp[idx]) {
                sumQ += Math.max(floor(needed, 100*(idx + 1)), 0);
                ans = Math.min(ans, sumQ);
            }
            if (idx == -1 && needed <= 0) {
                ans = Math.min(ans, sumQ);
            }
        }
        so.println(ans);
    }
    
    static int floor(int a, int b) {
        return (a + b - 1) / b;
    }
    
    static int sum(int[] a,int bits, int numBits) {
        int sum = 0;
        int mask = 1;
        
        for (int i = 0; i < numBits; i++) {
            if (((bits >> i) & mask) == 1) {
                sum += a[i];
            }
        }
        return sum;
    }
    
    static int firstIdxOf0(int bits, int numBits) {
        int mask = 1;
        for (int i = 1; i <= numBits; i++) {
            int shifted = bits >> (numBits - i);
            if ((shifted & mask) == 0) {
                return (numBits - i);
            }
        }
        return -1;
    }
}
