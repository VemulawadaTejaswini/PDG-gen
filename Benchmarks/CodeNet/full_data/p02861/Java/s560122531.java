import java.util.Arrays;
import java.util.Scanner;

public class D {
    static int[][] town;
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        town = new int[N][2];
        for (int i = 0; i < town.length; i++) {
            town[i][0] = sc.nextInt();
            town[i][1] = sc.nextInt();
        }
        final int[] perm = new int[N];
        Arrays.fill(perm, -1);
        final double total = perm(perm, 0);
        int fact = 1;
        for (int i = 2; i <= N; i++) {
            fact *= i;
        }
        System.out.println(total / fact);
    }

    static double perm(int[] perm, int depth) {
        if (depth == perm.length) {
            return totalLength(perm, town);
        }
        double ret = 0;
        for (int i = 0; i < perm.length; i++) {
            if (perm[i] != -1) {
                continue;
            }
            perm[i] = depth;
            ret += perm(perm, depth + 1);
            perm[i] = -1;
        }
        return ret;
    }

    private static double totalLength(final int[] perm, final int[][] town) {
        double ret = 0;
        for (int i = 0; i < perm.length - 1; i++) {
            ret += len(town[perm[i]], town[perm[i + 1]]);
        }
        return ret;
    }

    static double len(int[] a, int[] b) {
        return Math.sqrt((a[0]-b[0]) * (a[0]-b[0]) + (a[1]-b[1]) * (a[1]-b[1]));
    }
}
