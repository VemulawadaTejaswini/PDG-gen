import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] data = new long[N];
        long[] original = new long[N];
        for (int i = 0; i < N; i++) {
            long x = scan.nextLong();
            data[i] = x;
            original[i] = x;
        }
        Arrays.sort(data);
        for (int i = 0; i < N; i++) {
            long base = original[i];
            long target = data[(N-1)/2];
            if (target < base) {
                System.out.println(target);
            } else {
                System.out.println(data[(N-1)/2 + 1]);
            }
        }
    }
}
