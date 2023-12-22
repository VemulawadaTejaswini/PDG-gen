import java.io.*;

/**
 * Created by Ayushi on 19 Apr 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        br.close();
        double ans = n*2;
        ans = ans * Math.PI;
        System.out.println(ans);
    }
}
