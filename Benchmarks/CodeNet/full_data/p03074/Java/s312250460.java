import javafx.util.Pair;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        String s = input.next();
        int[] ss = new int[n];
        Vector<Pair<Integer, Integer>> d = new Vector<>();
        int prev = -1, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') ss[i] = 0;
            else ss[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (prev == ss[i]) cnt++;
            else {
                if (cnt > 0) d.add(new Pair<>(prev, cnt));
                cnt = 1;
                prev = ss[i];
            }
        }
        if (cnt > 0) d.add(new Pair<>(prev, cnt));
        int l = 0, r = 0, sum = 0, v = 0;
        for (int i = 0; i < d.size(); i++) {
            sum += d.get(i).getValue();
            if (d.get(i).getKey() == 0) {
                v++;
                while (v > k) {
                    sum -= d.get(l).getValue();
                    if (d.get(l).getKey() == 0) v--;
                    l++;
                }
            }
            if (r < sum) r = sum;
        }
        System.out.println(r);
    }
}
