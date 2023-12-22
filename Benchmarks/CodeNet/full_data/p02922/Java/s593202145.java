import java.io.*;

/**
 * Created by Ayushi on 01/09/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = r.readLine().split(" ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);
        r.close();
        int c = a;
        a--;

        int i;
        for (i = 1; true; i++) {
            if (c >= b) break;

            c += a;
        }

        System.out.println(i);
    }
}
