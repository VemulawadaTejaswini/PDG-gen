import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static Scanner sc = null;
    static PrintWriter pw = null;

    //
//
//


    static {

        sc = new Scanner(System.in);
    }
//    static {
//        sc = new Scanner("5 5 \n" +
//                "20 23 12 18 2 \n" +
//                "19 14 17 6 9 \n" +
//                "24 15 13 16 10 \n" +
//                "4 1 8 3 5 \n" +
//                "11 7 21 22 25 ");
//
//    }
//    static Scanner sc = new Scanner("5\n" +
//            "5 3\n" +
//            "4 1\n" +
//            "9 1\n" +
//            "2 1\n" +
//            "5 4\n" +
//            "1 1\n" +
//            "8 2\n" +
//            "3 2\n" +
//            "6 1\n" +
//            "12 6\n" +
//            "15 2\n" +
//            "22 1\n" +
//            "4 2\n" +
//            "14 1\n" +
//            "23 1\n" +
//            "19 2\n" +
//            "53 9\n" +
//            "7 1\n" +
//            "19 1\n" +
//            "23 2\n" +
//            "40 2\n" +
//            "54 2\n" +
//            "81 1\n" +
//            "85 2\n" +
//            "94 1\n" +
//            "102 1\n" +
//            "8128376 30\n" +
//            "259694 2\n" +
//            "10267200 2\n" +
//            "591548 2\n" +
//            "5755696 2\n" +
//            "4307513 2\n" +
//            "5863522 2\n" +
//            "10040589 1\n" +
//            "2234412 1\n" +
//            "5086932 1\n" +
//            "14706276 1\n" +
//            "15430629 2\n" +
//            "2150128 2\n" +
//            "14561793 1\n" +
//            "7991506 2\n" +
//            "824138 2\n" +
//            "3450600 2\n" +
//            "6482303 1\n" +
//            "11413148 1\n" +
//            "12215231 2\n" +
//            "7578498 1\n" +
//            "13184008 2\n" +
//            "6684996 1\n" +
//            "11579040 1\n" +
//            "2662824 1\n" +
//            "13334004 2\n" +
//            "5954542 1\n" +
//            "7364389 1\n" +
//            "8028062 1\n" +
//            "11858536 1\n" +
//            "15223536 2");


    static int ni() {
        return sc.nextInt();
    }

    static int[] nia(int l) {
        int[] r = new int[l];
        for (int s = 0; s < l; s++) {
            r[s] = ni();
        }
        return r;
    }


    public static void main(String[] args) {
        boolean multi = false;

        if (multi) {
            int n = ni();
            for (int i = 0; i < n; i++) {
                solve(i + 1);
            }
        } else {
            solve(1);
        }

    }

    private static void solve(int csn) {
        int n = ni();

        int [] a = nia(n);
        int [] b = nia(n);
        int best = 100000;
        for (int s = 0 ; s < (1L << n) ; s++) {
//            if  (Integer.bitCount(s) % 2 == 1) continue;

            int [][] mn = new int[n][2];

            for (int k = 0 ; k < n ; k++) {
                if (((1 << k) & s) > 0) {
                    mn[k][0] = b[k];
                    mn[k][1] = 1;
                } else {
                    mn[k][0] = a[k];
                }
            }
            int r = sl(mn);

//            System.out.println(s + " " + r);
            best = Math.min(r, best);
        }
        if (best == 10000000) {
            System.out.println(-1);
        } else {
            System.out.println(best);
        }

    }

    private static int sl(int[][] mn) {
        int [] output = new int[mn.length];
        for (int s = 0 ; s < output.length ; s++) {
            output[s] = mn[s][0];
        }
        int price = 0;
        Arrays.sort(output);
        for (int k = 0 ; k < output.length ; k++) {
            boolean f = false;
            for (int r = k ; r < output.length ; r++) {
                if (mn[r][0] == output[k] && (r - k) % 2 == mn[r][1]) {
                    for (int s = r ; s > k ; s--) {
                        mn[s][1] = 1 - mn[s][1];
                        mn[s - 1][1] = 1 - mn[s - 1][1];
                        int xx = mn[s][0];
                        mn[s][0] = mn[s - 1][0];
                        mn[s - 1][0] = xx;
                        price++;
                    }

                    f = true;
                    break;
                }
            }
            if (!f) {
                return 10000000;
            }
        }
        return price;
    }


    private static void printArray(int[][] nd) {
        for (int[] k : nd) {
            for (int i : k) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }

    private static void update(boolean[][] contains, int[] ints) {
        for (int s = 0; s < ints.length; s++) {
            contains[s][ints[s] / ints.length] = true;
        }
    }


    private static final int[] inn(int n) {
        int[] data = new int[n];
        Arrays.fill(data, -1);
        return data;
    }

    private static final int max(int[] n) {
        int max = 0;
        for (int i : n) {
            max = Math.max(i, max);
        }
        return max;
    }


}
