import java.io.*;

/**
 * Created by Ayushi on 01/09/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = r.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        long[] a = new long[n];
        temp = r.readLine().split(" ");
        long c, m;
        c = m = 1;
        a[0] = Long.parseLong(temp[0]);
        for (int i = 1; i < n; i++) {
            a[i] = Long.parseLong(temp[i]);

            if (a[i] > a[i-1]) {
                m = Math.max(m, c);
                c = 1;
                //i++;
            }
            else {
                c++;
            }

            /*System.out.println("a[i] = " + a[i]);
            System.out.println("c = " + c);
            System.out.println("m = " + m);*/
        }
        r.close();

        System.out.println(Math.max(m, c)-1);
    }
}
