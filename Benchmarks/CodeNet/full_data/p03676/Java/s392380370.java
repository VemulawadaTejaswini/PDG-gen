import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static long[] headComb;
    private static long[] midComb;
    private static long[] tailComb;

    private static void solve(Scanner scanner) {
//        int N = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
        int[] nums = lineToIntNums(scanner.nextLine());

        Map<Integer, Integer> numCount = new HashMap<>();
        int dup = -1;
        for (int i = 0; i < nums.length; i ++) {
            numCount.put(nums[i], numCount.getOrDefault(nums[i], 0) + 1);
            if (numCount.get(nums[i]) == 2) dup = nums[i];
        }

        int nHead = 0, nMid = 0, nTail = 0;
        int ind = 0;
        while (nums[ind] != dup) {
            nHead ++;
            ind ++;
        }
        ind ++;
        while (nums[ind] != dup) {
            nMid ++;
            ind ++;
        }
        nTail = nums.length - 2 - nHead - nMid;

        if(! (nHead + nMid + nTail + 2 == nums.length)) {
            throw new RuntimeException();
        }

        // calc comb
        headComb = new long[nHead + 1];
        headComb[0] = 1;
        for (int i = 1; i <= nHead; i ++) {
            headComb[i] = headComb[i - 1] * (nHead - (i - 1)) / i;
        }

        midComb = new long[nMid + 1];
        midComb[0] = 1;
        for (int i = 1; i <= nMid; i ++) {
            midComb[i] = midComb[i - 1] * (nMid - (i - 1)) / i;
        }

        tailComb = new long[nTail + 1];
        tailComb[0] = 1;
        for (int i = 1; i <= nTail; i ++) {
            tailComb[i] = tailComb[i - 1] * (nTail - (i - 1)) / i;
        }

        // calc result
        long[] ret = new long[nums.length + 1];
        for (int k1 = 0; k1 <= nHead; k1 ++) {
            for (int k2 = 0; k2 <= nMid; k2 ++) {
                for (int k3 = 0; k3 <= nTail; k3 ++) {
//                    System.out.println((k1 + k2 + k3) + "(" + k1 + "," + k2 + "," + k3 + ",p0): " + retAdd0(k1, k2, k3));
//                    System.out.println((k1 + k2 + k3 + 1) + "(" + k1 + "," + k2 + "," + k3 + ",p1): " + retAdd1(k1, k2, k3));
//                    System.out.println((k1 + k2 + k3 + 2) + "(" + k1 + "," + k2 + "," + k3 + ",p2): " + retAdd2(k1, k2, k3));

//                    ret[k1 + k2 + k3] += retAdd0(k1, k2, k3);
//                    ret[k1 + k2 + k3 + 1] += retAdd1(k1, k2, k3);
//                    ret[k1 + k2 + k3 + 2] += retAdd2(k1, k2, k3);

                    ret[k1 + k2 + k3] = addMod(ret[k1 + k2 + k3], retAdd0(k1, k2, k3));
                    ret[k1 + k2 + k3 + 1] = addMod(ret[k1 + k2 + k3 + 1], retAdd1(k1, k2, k3));
                    ret[k1 + k2 + k3 + 2] = addMod(ret[k1 + k2 + k3 + 2], retAdd2(k1, k2, k3));
                }
            }
        }

        for (int i = 1; i < ret.length; i ++) {
            System.out.println(ret[i]);
        }
    }

    private static long retAdd0(int k1, int k2, int k3) {
        return headComb[k1] * midComb[k2] * tailComb[k3];
    }

    private static long retAdd1(int k1, int k2, int k3) {
        if (k1 == 0 && k2 == 0 && k3 == 0) {
            return 1;
        } else if (k1 == 0 && k2 == 0) {
            return tailComb[k3];
        } else if (k1 == 0 && k3 == 0) {
            return 2 * midComb[k2];
        } else if (k2 == 0 && k3 == 0) {
            return headComb[k1];
        } else if (k1 == 0) {
            return 2 * midComb[k2] * tailComb[k3];
        } else if (k2 == 0) {
            return headComb[k1] * tailComb[k3];
        } else if (k3 == 0) {
            return 2 * headComb[k1] * midComb[k2];
        } else if (k1 != 0 && k2 != 0 && k3 != 0) {
            return 2 * headComb[k1] * midComb[k2] * tailComb[k3];
        } else {
            throw  new RuntimeException();
        }
    }

    private static long retAdd2(int k1, int k2, int k3) {
        if (k1 == 0 && k2 == 0 && k3 == 0) {
            return 1;
        } else if (k1 == 0 && k2 == 0) {
            return tailComb[k3];
        } else if (k1 == 0 && k3 == 0) {
            return midComb[k2];
        } else if (k2 == 0 && k3 == 0) {
            return headComb[k1];
        } else if (k1 == 0) {
            return midComb[k2] * tailComb[k3];
        } else if (k2 == 0) {
            return headComb[k1] * tailComb[k3];
        } else if (k3 == 0) {
            return headComb[k1] * midComb[k2];
        } else if (k1 != 0 && k2 != 0 && k3 != 0) {
            return headComb[k1] * midComb[k2] * tailComb[k3];
        } else {
            throw  new RuntimeException();
        }
    }

    private static final long mod = 1000000007;

    private static long addMod(long a, long b) {
        return (a + b) % mod;
    }

    private static final String ex1 = "3\n" +
            "1 2 1 3";
    private static final String ex2 = "32\n" +
            "29 19 7 10 26 32 27 4 11 20 2 8 16 23 5 14 6 12 17 22 18 30 28 24 15 1 25 3 13 21 19 31 9";

    public static void main(String[] args) {
//        solve(new Scanner(ex1));
//        System.out.println();
//        solve(new Scanner(ex2));
//        System.out.println();

        solve(new Scanner(System.in));
    }

    private static int[] lineToIntNums(String line) {
        String[] strNums = line.split(" ");
        int[] ret = new int[strNums.length];
        for (int i = 0; i < strNums.length; i ++) {
            ret[i] = Integer.parseInt(strNums[i]);
        }
        return ret;
    }

    private static long[] lineToLongNums(String line) {
        String[] strNums = line.split(" ");
        long[] ret = new long[strNums.length];
        for (int i = 0; i < strNums.length; i ++) {
            ret[i] = Long.parseLong(strNums[i]);
        }
        return ret;
    }
}
