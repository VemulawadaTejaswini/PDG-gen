import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        
        System.out.println(check(N, M, K) ? "Yes" : "No");
        
        return;
    }
    
    private static boolean check(long N, long M, long K) {
        for (long col = 0; col <= M; col++) 
        for (long row = 0; row <= N; row++) {
            long sum = col * N + M * row - 2 * col * row;
            //System.err.printf("(r, c) = (%d, %d) : sum = %d%n", row, col, sum);
            if (sum == K) return true;
        }
        return false;
    }
    
}