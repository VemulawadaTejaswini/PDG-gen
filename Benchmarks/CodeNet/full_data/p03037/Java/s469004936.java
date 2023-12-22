import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = reader.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int maxl = 0;
        int minr = n;
        for (int i = 0; i < m; i++) {
            String[] lr = reader.readLine().split(" ");
            int l = Integer.parseInt(lr[0]);
            int r = Integer.parseInt(lr[1]);
            if (maxl < l) {
                maxl = l;
            }
            if (r < minr) {
                minr = r;
            }
            if (minr < maxl) {
                break;
            }
        }
        System.out.println(Integer.max(0, minr - maxl + 1));
    }
}
