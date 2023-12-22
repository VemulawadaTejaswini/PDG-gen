import java.util.*;
import java.util.stream.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static int mod = (int) 10e8 + 7;

    public static void main(String[] args) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] p = new int[n];
        int[] r = new int[n];
        p[0] = -1;
        for (int i = 0; i < n-1; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            p[b] = a;
        }
        for (int i = 0; i < q; ++i) {
            r[sc.nextInt()-1] += sc.nextInt();
        }
        for (int i = 1; i < n; ++i) r[i] += r[p[i]];
        System.out.println(Arrays.stream(r).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }

}
