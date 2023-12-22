
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //		ABC115_A();
        //		ABC115_B();
        //		ABC115_C();
        ABC115_D();
    }

    private static void ABC115_A() {
        Scanner scanner = null;
        int date = 0;

        try {
            scanner = new Scanner(System.in);
            date = scanner.nextInt();

            switch (date) {
                case 22:
                    System.out.println("Christmas Eve Eve Eve");
                    break;
                case 23:
                    System.out.println("Christmas Eve Eve");
                    break;
                case 24:
                    System.out.println("Christmas Eve");
                    break;
                case 25:
                    System.out.println("Christmas");
                    break;
                default:
                    System.out.println("fail!");
                    break;
            }

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static void ABC115_B() {
        Scanner scanner = null;
        int numItem = 0;

        try {
            scanner = new Scanner(System.in);
            numItem = scanner.nextInt();
            int[] priceArray = new int[numItem];

            for (int i = 0; i < numItem; i++) {
                priceArray[i] = scanner.nextInt();
            }

            Arrays.sort(priceArray);

            int prices = 0;
            for (int i = 0; i < priceArray.length; i++) {
                if (i != numItem - 1) {
                    prices += priceArray[i];
                } else {
                    prices += priceArray[i] / 2;
                }

            }

            System.out.println(prices);

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static void ABC115_C() {
        Scanner scanner = null;
        //totalTreeNum
        int numN = 0;
        //selectedTreeNum
        int numK = 0;

        try {
            scanner = new Scanner(System.in);
            numN = scanner.nextInt();
            numK = scanner.nextInt();

            int[] treeHeightList = new int[numN];

            for (int i = 0; i < numN; i++) {
                treeHeightList[i] = scanner.nextInt();
            }

            Arrays.sort(treeHeightList);

            int minDiff = 0;
            for (int i = 0; i < treeHeightList.length - (numK - 1); i++) {
                if (i == 0) {
                    minDiff = treeHeightList[i + numK - 1] - treeHeightList[i];
                }
                if (minDiff > treeHeightList[i + numK - 1] - treeHeightList[i]) {
                    minDiff = treeHeightList[i + numK - 1] - treeHeightList[i];
                }

            }
            System.out.println(minDiff);

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static void ABC115_D() {
        Scanner scanner = null;
        int burgerLevel = 0;
        long biteNum = 0;

        try {
            scanner = new Scanner(System.in);
            burgerLevel = scanner.nextInt();
            biteNum = scanner.nextLong();

            /*
             * TLE
             */
//            List<Integer> baseBurger = getBite(burgerLevel);
//            long res = 0;
//            int n = baseBurger.size() - 1;
//            for (int i = 0; i < biteNum; i++) {
//                if (baseBurger.get(n - i) == 1)
//                    res++;
//            }
//            System.out.println(res);

            long[] all = new long[burgerLevel + 1];
            all[0] = 1;
            long[] patty = new long[burgerLevel + 1];
            patty[0] = 1;
            for (int i = 1; i <= burgerLevel; i++) {
                all[i] = all[i - 1] * 2L + 3L;
                patty[i] = patty[i - 1] * 2L + 1L;
            }
            System.out.println(getBite(all, patty, burgerLevel, biteNum));
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static long getBite(long[] all, long[] patty, int level, long x) {
        if (level == 0)
            return 1;

        if (x == 1)
            return 0;
        //1個前のバーガー+バンズより小さい=バンズ1個食べて再帰
        if (x < all[level - 1] + 1)
            return getBite(all, patty, level - 1, x - 1);

        //1個前のバーガー+バンズと同じ=1個前のパティと同じ
        if (x == all[level - 1] + 1)
            return patty[level - 1];
        //1個前のバーガー+バンズ+パティと同じ=1個前のパティ+真ん中のパティ
        if (x == all[level - 1] + 2)
            return patty[level - 1] + 1;
        /*
        1個前のバーガー+バンズ+パティより大きい=1個前のパティ+真ん中のパティ+残り
        （ただし、バイト数は一番前のバンズと真ん中のパティ分はかんだこととする）
         */
        if (x > all[level - 1] + 2)
            return patty[level - 1] + 1 + getBite(all, patty, level - 1, x - (all[level - 1] + 2));

        return -1;
    }

    private static List<Integer> getBite(long level) {
        List<Integer> res = new ArrayList<Integer>();
        if (level == 0) {
            res.add(1);
            return res;
        }
        res.add(0);
        res.addAll(getBite(level - 1));
        res.add(1);
        res.addAll(getBite(level - 1));
        res.add(0);
        return res;
    }

}