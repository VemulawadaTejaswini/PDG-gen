import java.util.*;

public class Main {

    public static void main(String[] args) {
        int N;
        int[] a, b, c;
        try (Scanner scanner = new Scanner(System.in)) {
            N = scanner.nextInt();

            a = new int[N];
            b = new int[N];
            c = new int[N];

            for (int i = 0; i < N; i++) {
                a[i] = scanner.nextInt();
                b[i] = scanner.nextInt();
                c[i] = scanner.nextInt();
            }
        }

        int result = solve(a, b, c, N);
        System.out.println(result);

        //test();
    }

    private static int solve(int[] a, int[] b, int[] c, int N) {
        int sa = 0;
        int sb = 0;
        int sc = 0;
        for (int i = 0; i < N; i++) {
            int newSa = Math.max(sb, sc) + a[i];
            int newSb = Math.max(sa, sc) + b[i];
            int newSc = Math.max(sa, sb) + c[i];
            sa = newSa;
            sb = newSb;
            sc = newSc;
        }
        return Math.max(sa, Math.max(sb, sc));
    }

    private static void test() {
        testCase(new int[] { 10, 20, 30}, new int[] {40, 50, 60},  new int[] {70, 80, 90}, 210);
        testCase(new int[] { 100 }, new int[] {10},  new int[] {1}, 100);
        testCase(new int[] { 6,8,2,7,4,2,7}, new int[] {7,8,5,8,6,3,5},  new int[] {8,3,2,6,8,4,1}, 46);
        System.out.println("DONE");
    }

    private static void testCase(int[] a, int[] b, int[] c, int expected) {
        int result = solve(a, b, c, a.length);
        if (result != expected) {
            System.out.println("FAILED a=" + Arrays.toString(a) + " b=" + Arrays.toString(b) + " c=" + Arrays.toString(c)
                    + ", was " + result + " expected " + expected);
        }
    }
}
