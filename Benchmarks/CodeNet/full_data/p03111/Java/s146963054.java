import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = in.nextInt();
        }
        System.out.println(backtrack(0, 0, 0, 0));
    }

    static int a;
    static int b;
    static int c;
    static int[] l;

    private static int backtrack(int currA, int currB, int currC, int i) {
        if (i == l.length) {
            if (a == 0 || b == 0 || c == 0) {
                return Integer.MAX_VALUE;
            }
            return Math.abs(a - currA) + Math.abs(b - currB) + Math.abs(c - currC) - 30;
        }
        int nothing = backtrack(currA, currB, currC, i + 1);
        int addToA = backtrack(currA + l[i], currB, currC, i + 1) + 10;
        int addToB = backtrack(currA, currB + l[i], currC, i + 1) + 10;
        int addToC = backtrack(currA, currB, currC + l[i], i + 1) + 10;
        return Math.min(nothing, Math.min(addToA, Math.min(addToB, addToC)));

    }
}
