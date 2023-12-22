//Created by Aminul on 3/28/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int k = in.nextInt(), n = in.nextInt(), res = k;
        int prev = 0;
        for (int i = 1; i <= n; i++) {
            int curr = in.nextInt();
            res = min(res, k - (curr - prev));
            prev = curr;
        }
        pw.println(res);
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}