import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(sc.next());
        }

        long sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                sum += (A[i] ^ A[j]) % (Math.pow(10, 9) + 7);
            }
        }

        System.out.println((long) (sum % (Math.pow(10, 9) + 7)));
    }
}