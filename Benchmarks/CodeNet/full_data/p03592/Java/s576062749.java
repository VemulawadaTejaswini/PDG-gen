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
    
    private static boolean check(int N, int M, int K) {
        for (int col = 0; col < M; col++) 
        for (int row = 0; row < N; row++) {
            int sum = col * N + M * row - 2 * col * row;
            //System.err.printf("(r, c) = (%d, %d) : sum = %d%n", row, col, sum);
            if (sum == K) return true;
        }
        return false;
    }
    
}