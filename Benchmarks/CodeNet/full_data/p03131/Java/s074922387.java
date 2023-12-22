// When I hit my pocket
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); // number of operations
        int A = sc.nextInt(); // exchange A biscuits to 1 yen
        int B = sc.nextInt(); // exchange 1 yen to B biscuits
        long max = 0;

        if (B - A < 3) {
            max += (long) K + 1; 
        } else {
            if (K % (A + 2) == A + 1) {
                max += (K / (A + 2) + 1) * B;
            } else {
                max += (K / (A + 2) * B) + K % (A + 2) + 1;
            }
        }
        System.out.println(max);
    }
}