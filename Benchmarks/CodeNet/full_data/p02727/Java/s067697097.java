import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        Integer[] p = new Integer[a];
        Integer[] q = new Integer[b];
        Integer[] r = new Integer[c];

        for (int i = 0; i < a; i++) {
            p[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < b; i++) {
            q[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < c; i++) {
            r[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(p, Comparator.reverseOrder());
        Arrays.sort(q, Comparator.reverseOrder());
        Arrays.sort(r, Comparator.reverseOrder());

        long sum = 0;

        for (int i = 0; i < x; i++) {
            sum += p[i];
        }
        for (int i = 0; i < y; i++) {
            sum += q[i];
        }

        int r_worst = x - 1;
        int g_worst = y - 1;

        int i = 0;
        boolean r_end = false;
        boolean g_end = false;
        int min = Math.min(a + b, c);
        while (i < min) {
            if (r[i] >= Math.min(p[r_worst], q[g_worst])) {
                sum += r[i];
                i++;
                if (p[r_worst] < q[g_worst] && !r_end) {
                    sum -= p[r_worst];
                    r_worst--;
                    if (r_worst < 0) {
                        r_end = true;
                    }
                } else if (p[r_worst] >= q[g_worst] && !g_end) {
                    sum -= q[g_worst];
                    g_worst--;
                    if (g_worst < 0) {
                        g_end = true;
                    }
                }
                if (r_end && g_end) {
                    break;
                }
            } else {

                break;
            }

        }

        System.out.println(sum);
        sc.close();
    }
}