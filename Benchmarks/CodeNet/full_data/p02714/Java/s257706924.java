import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        int[] r = new int[4000];
        int[] g = new int[4000];
        int[] b = new int[4000];
        int ir = 0;
        int ig = 0;
        int ib = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') r[ir++] = i;
            else if (s.charAt(i) == 'G') g[ig++] = i;
            else if (s.charAt(i) == 'B') b[ib++] = i;
        }

        int dup = 0;
        for (int i = 0; i < ir; i++) {
            for (int j = 0; j < ig; j++) {
                int larger = Math.max(r[i], g[j]);
                int smaller = Math.min(r[i], g[j]);
                if (search(b, larger + (larger - smaller), ib)) {
                    dup++;
                }
                if (search(b, smaller - (larger - smaller), ib)) {
                    dup++;
                }
                if ((larger + smaller) % 2 == 0 && search(b, (larger + smaller) / 2, ib)) {
                    dup++;
                }
            }
        }

        System.out.println(ir * ig * ib - dup);
    }

    static boolean search(int[] a, int t, int length) {
        int ok = 0;
        int ng = length;
        int pivot = (ok + ng) / 2;
        while (ok < ng) {
            if (a[pivot] == t) return true;
            else if (a[pivot] < t) {
                ok = pivot + 1;
            } else {
                ng = pivot;
            }

            pivot = (ok + ng) / 2;
        }

        return false;
    }
}
