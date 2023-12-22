import java.util.*;

public class Main {
    static long[] as, bs;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        as = new long[n];
        bs = new long[n];
        for (int i = 0; i < n; i++)
            as[i] = sc.nextLong();
        for (int i = 0; i < n; i++)
            bs[i] = sc.nextLong();
        long sumA = Arrays.stream(as).sum();
        long sumB = Arrays.stream(bs).sum();
        /*
        List<Long> aList = new ArrayList<>();
        List<Long> bList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (as[i] != bs[i]) {
                aList.add(as[i]);
                bList.add(bs[i]);
            }
        }
        */

        long diffNum = 0;
        for (int i = 0; i < n; i++) {
            if (as[i] > bs[i]) {
                diffNum -= (as[i] - bs[i]);
            } else if (as[i] < bs[i]) {
                diffNum += (bs[i] - as[i]) / 2;
            }
        }
        if (diffNum >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        /*
        for (int i = 0; i <= sumB - sumA; i++) {
            if (aList.equals(bList)) {
                System.out.println("Yes");
                return;
            }
            if (i == sumB - sumA) break;
            boolean flaga = false;
            boolean flagb = false;
            for (int j = 0; j < aList.size(); j++) {
                if (flaga && flagb) break;
                if (!flaga && aList.get(j) < bList.get(j)) {
                    flaga = true;
                    aList.set(j, aList.get(j) + 2);
                }
                if (!flagb && aList.get(j) > bList.get(j)) {
                    flagb = true;
                    bList.set(j, bList.get(j) + 1);
                }
            }
        }
        System.out.println("No");
        */
    }
}
