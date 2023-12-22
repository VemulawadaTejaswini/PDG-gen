import java.io.*;
import java.util.HashMap;

/**
 * Created by Ayushi on 15/09/2019.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = r.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        for (int i = 1; i <= n; i++) {
            hmap.put(i, 0);
        }
        int k = Integer.parseInt(temp[1]);
        int q = Integer.parseInt(temp[2]);
        for (int j = 0; j < q; j++) {
            temp = r.readLine().split(" ");
            int x = Integer.parseInt(temp[0]);
            hmap.put(x, hmap.get(x)+1);
        }
        r.close();
        for (int l = 1; l <= n; l++) {
            if (hmap.get(l) <= (q-k)) {
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
        }
    }
}
