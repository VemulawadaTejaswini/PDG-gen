import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nq = reader.readLine().split(" ");
        int n = Integer.parseInt(nq[0]);
        int q = Integer.parseInt(nq[1]);
        STX[] stx = new STX[n];
        for (int i = 0; i < n; i++) {
            String[] stxarr = reader.readLine().split(" ");
            int s = Integer.parseInt(stxarr[0]);
            int t = Integer.parseInt(stxarr[1]);
            int x = Integer.parseInt(stxarr[2]);
            stx[i] = new STX(s, t, x);
        }
        Arrays.sort(stx);
        for (int i = 0; i < q; i++) {
            int d = Integer.parseInt(reader.readLine());
            int result = -1;
            for (STX curstx : stx) {
                if (curstx.willStop(d)) {
                    result = curstx.x;
                    break;
                }
            }
            System.out.println(result);
        }
    }
    private static class STX implements Comparable<STX> {
        int s_x;
        int t_x;
        int x;
        private STX(int s, int t, int x) {
            this.s_x = s - x;
            this.t_x = t - x;
            this.x = x;
        }
        private boolean willStop(int d) {
            return s_x <= d && d < t_x;
        }
        public int compareTo(STX o) {
            return Integer.compare(this.x, o.x);
        }
    }
}
