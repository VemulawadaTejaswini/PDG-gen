import java.io.*;
import java.util.Arrays;

/**
 * Created by Ayushi on 18/08/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = r.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        double[] a = new double[n];
        temp = r.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Double.parseDouble(temp[i]);
        }
        r.close();

        Arrays.sort(a);

        double ans = a[0];
        for (int j = 1; j < n; j++) {
            ans += a[j];
            ans = ans/2;
        }

        System.out.println(ans);
    }
}
