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
        int n = Integer.parseInt(temp);

        temp = br.readLine();
        st = new StringTokenizer(temp, " ");
        HashMap<Long, Long> hmap = new HashMap<>();
        //int a;
        long[] a = new long[n];
        ArrayList<Long> keys = new ArrayList<>();
        int j = 0;
        while (st.hasMoreTokens()) {
            a[j] = Integer.parseInt(st.nextToken());
            if (hmap.containsKey(a[j])) {
                hmap.replace(a[j], hmap.get(a[j])+1);
            }
            else {
                hmap.put(a[j], (long) 1);
                keys.add(a[j]);
            }
            j++;
        }
        br.close();

        HashMap<Long, Long> answers = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            long ans = 0;
            for (Long key : keys) {
                if (!key.equals(keys.get(i))) {
                    ans += Math.max(((hmap.get(key)) * (hmap.get(key) - 1)) / 2, 0);
                } else {
                    ans += Math.max(((hmap.get(key) - 1) * (hmap.get(key) - 2)) / 2, 0);
                }
            }
            answers.put(keys.get(i), ans);
        }
        for (long m : a) System.out.println(answers.get(m));
    }
}
