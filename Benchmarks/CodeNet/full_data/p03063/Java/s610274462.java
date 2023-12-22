import java.util.*;
import java.util.stream.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        boolean[] b = new boolean[n];
        String s = scanner.next();
        IntStream.range(0, n).forEach(i -> b[i] = s.charAt(i) == '#');
        int[] c = new int[n + 1];
        for (int i = 0; i < n; i++)
            c[i + 1] = c[i] + (s.charAt(i) == '#' ? 1 : 0);

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            int bb = c[i];          //前の黒
            int bw = i - bb;        //前の白
            int ab = c[n] - bb;     //後の黒
            int aw = n - c[n] - bw; //後の白

            ans = Math.min(ans, bb + aw);
        }

        System.out.println(Arrays.toString(c));
    }
}