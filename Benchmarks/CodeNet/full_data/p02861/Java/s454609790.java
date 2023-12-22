package abc145.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // C - xxxxx

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        List<int[]> ptn = new ArrayList<int[]>();

        for (int j = 0; j < n; j++) {
            setPtn(0, j, new int[n], ptn);
        }

        double dist = 0;
        double total = 0;
        double ave = 0;
        for (int[] route : ptn) {
            for (int i = 0; i < n - 1; i++) {
                dist = Math
                        .sqrt(Math.pow(x[route[i]] - x[route[i + 1]], 2) + Math.pow(y[route[i]] - y[route[i + 1]], 2));
                total += dist;
            }
//            System.out.println("total=" + total);
        }
        ave = total / ptn.size();

        System.out.println(ave);
    }

    static void setPtn(int d, int c, int[] idx, List<int[]> ptn) {
        //        System.out.println(
        //                "setPtn start d=" + d + " ,c=" + c + " ,idx=" + Arrays.toString(idx) + " ,ptn.size=" + ptn.size());
        for (int k = 0; k < d; k++) {
            if (c == idx[k]) {
                //                System.out.println("setPtn c==idx[" + k + "] (" + idx[k] + ")");
                return;
            }
        }
        idx[d] = c;
        if (idx.length - 1 > d) {
            for (int l = 0; l < idx.length; l++) {
                //                System.out.println("setPtn re");
                setPtn(d + 1, l, idx, ptn);
            }
        } else {
            System.out.print("setPtn add ");
            int[] tmpidx = idx.clone();
//            System.out.println(Arrays.toString(tmpidx));
            ptn.add(tmpidx);
        }
    }

}
