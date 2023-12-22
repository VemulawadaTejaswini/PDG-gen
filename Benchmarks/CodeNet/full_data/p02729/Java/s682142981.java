import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 22 Mar 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        st = new StringTokenizer(temp, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        br.close();

        int ans = (n*(n-1))/2;
        ans += (m*(m-1))/2;
        System.out.println(ans);
    }
}
