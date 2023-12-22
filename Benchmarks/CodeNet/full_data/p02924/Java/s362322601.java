import java.io.*;

/**
 * Created by Ayushi on 01/09/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = r.readLine().split(" ");
        long n = Long.parseLong(temp[0]);
        r.close();
        int x;
        if (n%2 == 0) x = 1;
        else x = 0;
        long ans = (n/2)*(n-x);
        System.out.println(ans);
    }
}
