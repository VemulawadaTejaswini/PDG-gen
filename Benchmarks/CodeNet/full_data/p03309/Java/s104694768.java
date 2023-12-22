import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < A.length; i++) {
                A[i] = in.nextInt();
            }

            long min = (int) 1e9;
            for (int l = -(int)1e9, r = (int) 1e9; l + 1 < r;) {
                int c = (l + r) / 2;
                long snukeL = snuke(A, l);
                long snukeR = snuke(A, r);
                long snuke = snuke(A, c);
                min = Math.min(min, snuke);
                if (snuke < snukeR) {
                    r = c;
                } else {
                    l = c;
                }
            }
            System.out.println(min);
        }
    }

    private static long snuke(int[] a, int c) {
        long value = 0;
        for (int i = 0; i < a.length; i++) {
            value += Math.abs(a[i] - (c + i));
        }
        return value;
    }
}
