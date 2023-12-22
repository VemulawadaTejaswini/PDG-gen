import java.util.*;

public class Main {

    private static int N, Q;
    private static String s;
    private static char[] t;
    private static char[] d;
    private static boolean searchForLeft;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Q = sc.nextInt();
        s = " " + sc.next() + " ";
        t = new char[Q];
        d = new char[Q];
        for (int q = 0; q < Q; q += 1) {
            t[q] = sc.next().charAt(0);
            d[q] = sc.next().charAt(0);
        }

        searchForLeft = true;
        int rightmost = binarySearch(0, N);
        searchForLeft = false;
        int leftmost = binarySearch(0, N);
        int nSurvive = leftmost - rightmost - 1;
        if (nSurvive < 0) {
            System.out.println(0);
        } else {
            System.out.println(nSurvive);
        }
    }

    private static int binarySearch(int left, int right) {
        if (right - left <= 1) {
            if (searchForLeft) { // Search for `finalPosition == -1`
                if (finalPosition(left) == -1) {
                    return left;
                } else {
                    return left - 1;
                }
            } else {            // Search for `finalPosition == N`
                if (finalPosition(left) == N) {
                    return left;
                } else {
                    return left + 1;
                }
            }
        }

        int middle = left + (right - left) / 2;
        int finalPosition = finalPosition(middle);
        if (searchForLeft) {        // Search for `finalPosition == -1`
            if (finalPosition == -1) {
                return binarySearch(middle, right);
            } else {
                return binarySearch(left, middle);
            }
        } else {                // Search for `finalPosition == N`
            if (finalPosition == N) {
                return binarySearch(left, middle);
            } else {
                return binarySearch(middle, right);
            }
        }
    }

    private static int finalPosition(int index) {
        for (int q = 0; q < Q; q += 1) {
            if (t[q] == s.charAt(index + 1)) {
                index += d[q] == 'R' ? 1 : -1;
            }
        }
        return index;
    }

}
