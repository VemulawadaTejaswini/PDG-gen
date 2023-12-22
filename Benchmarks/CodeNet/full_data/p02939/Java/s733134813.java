import java.io.*;

/**
 * Created by Ayushi on 17/08/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] a = r.readLine().split("");
        int n = a.length;
        r.close();
        String c;
        int j;
        String p = a[0];
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (a[i].equals(p) && i != n-1) {
                p = a[i] + a[i+1];
                i++;
            }
            else if (a[i].equals(p)) {
                p = p + a[i];
                ans--;
            }
            else {
                p = a[i];
            }
            ans++;
        }
        System.out.println(ans);
    }
}
