import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public long getBalance(int[] A, int L, int R) {
        if (L == R) {
            return A[L];
        }
        long left = A[L] - getBalance(A, L + 1, R);
        long right = A[R] - getBalance(A, L, R - 1);
        return Math.max(left, right);
    }
    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
          	Main app = new Main();
            String[] split = br.readLine().split(" ");
            int[] A = new int[split.length];
            for (int i = 0; i < split.length; i++) {
               A[i] = Integer.parseInt(split[i]); 
            }
            long result = app.getBalance(A, 0, A.length - 1);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
