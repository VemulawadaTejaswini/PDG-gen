import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] x = new int[n];
        int[] y = new int[n];
        long[] h = new long[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextLong();
        }

        int xRel = 0;
        int yRel = 0;
        long hRel = 1;
        boolean flag = false;

        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                flag = false;
                for (int i = 0; i < n; i++) {
                    if (h[i] > 0) {
                        long hTmp = h[i] + Math.abs(cx-x[i]) + Math.abs(cy-y[i]);
                        if (hRel <= 1) {
                            hRel = hTmp;
                            flag = true;
                        }
                        if (hRel == hTmp) {
                            xRel = cx;
                            yRel = cy;
                            hRel = hTmp;
                            flag = true;
                        } else {
                            xRel = 0;
                            yRel = 0;
                            hRel = 1;
                            flag = false;
                        }
                    } else {
                        continue;
                    }
                    if (!flag) break;
                }
                if (flag) break;
            }
            if (flag) break;
        }
        System.out.println(xRel + " " + yRel + " " + hRel + " ");
        sc.close();
    }
}
