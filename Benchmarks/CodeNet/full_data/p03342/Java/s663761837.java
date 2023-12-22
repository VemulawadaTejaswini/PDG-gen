import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static final PrintStream ps = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] score = new int[n];
        boolean[] b = new boolean[20];
        
        for (int i = 0; i < n; i++) {
            fill(b, a[i]);
            score[i]++;
            
            
            for (int j = i+1; j < n; j++) {
                int aj = a[j];
                if (fill(b, aj)) {
                    score[i]++;
                } else {
                    break;
                }
            }
            b = new boolean[20];
        }
        long total = 0;
        for (int i = 0; i < n; i++) {
            total += score[i];
        }
        ps.println(total);
    }
    
    public static boolean fill(boolean[] b, int n) {
        int x = b.length - 1;
        while (n > 0) {
            int a = n & 1;
            if (a == 1) {
                if (!b[x]) {
                    b[x] = true;
                } else {
                    return false;
                }
            }
            n = n >> 1;
            x--;
        }
        return true;
    }
}
