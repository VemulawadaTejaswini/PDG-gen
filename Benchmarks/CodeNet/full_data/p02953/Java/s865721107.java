import java.io.*;

/**
 * Created by Ayushi on 04/08/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = r.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        temp = r.readLine().split(" ");
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(temp[i]);
        }
        r.close();
        boolean ans = true;
        main_loop:
        for (int j = 0; j < n-1; j++) {
            for (int k = j+1; k < n; k++) {
                if (s[j] - s[k] > 1) {
                    ans = false;
                    break main_loop;
                }
            }
        }
        System.out.println(ans ? "Yes":"No");
    }
}
