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
            int l = -(int) 1e9, r = (int) 1e9;
            for (; l + 1 < r;) {
                int c = (l + r) / 2;
                // long snukeL = snuke(A, l);
                // long snukeR = snuke(A, r);
                long snuke = snuke(A, c);
                long snukeP = snuke(A, c + 1);
                long snukeM = snuke(A, c - 1);
                if (snukeP < snuke) {
                    l = c;
                } else if (snukeM < snuke) {
                    r = c;
                } else {
                    min = Math.min(min, snuke);
                    break;
                }
            }
            long snukeL = snuke(A, l);
            long snukeR = snuke(A, r);
            min = Math.min(min, snukeL);
            min = Math.min(min, snukeR);
            System.out.println(min);
        }
    }

    private static long snuke(int[] a, int c) {
        long value = 0;
        for (int i = 0; i < a.length; i++) {
            value += Math.abs(a[i] - (c + i + 1));
        }
        return value;
    }
}
