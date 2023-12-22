
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] result = new int[n];
        boolean[] took = new boolean[n];
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]= in.nextInt();
        }
        int l = 0;
        int r = n - 1;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int id = i;
            long mx = 0;
            boolean left = true;
            int value = -1;
            int who = -1;
            for (int j = 0; j < n; j++) {
                if (took[j])
                    continue;
                int v = a[j];
                if (v * 1l * (r - j) > mx) {
                    mx = v * 1l * (r - j);
                    id = r;
                    left = false;
                    value = v;
                    who = j;
                }
                if ( v * 1l * (j - l) > mx) {
                    mx = v * 1l * (j - l);
                    id = l;
                    left = true;
                    value = v;
                    who = j;
                }
            }
            if (mx != 0) {
                took[who] = true;
                result[id] = value;
                ans += mx;
                if (left) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        out.println(ans);
        out.close();
    }
}
