import java.io.*;
import java.util.*;

public class Main {
    static final String YES = "Yes";
    static final String NO = "No";

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        String S;
        S = sc.next();

        final Solver solver = new Solver();
        if (solver.solve(S)) {
            System.out.println(YES);
        }
        else {
            System.out.println(NO);
        }
    }
}

class Solver {
    public boolean solve(String S) {
        final int length = S.length();
        if (length % 2 == 0) {
            return false;
        }

        if (!isPalindrome(S)) {
            return false;
        }

        final String first = S.substring(0, length / 2);
        final String second = S.substring(length / 2 + 1, length);
        return isPalindrome(first) && isPalindrome(second);
    }

    private boolean isPalindrome(final String s) {
        final int length = s.length();

        final String first;
        final String second;
        if (length % 2 == 0) {
            first = s.substring(0, length / 2);
            second = s.substring(length / 2, length);
        }
        else {
            first = s.substring(0, length / 2);
            second = s.substring(length / 2 + 1, length);
        }

        for (int i = 0; i < length / 2; i++) {
            if (first.charAt(i) != second.charAt(length / 2 - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

