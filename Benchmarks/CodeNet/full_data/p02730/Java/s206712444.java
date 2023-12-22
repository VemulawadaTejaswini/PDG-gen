import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {

    private static boolean checkP(String s, int start, int end) {
        int sum = start + end, limit = (sum % 2 == 0) ? ((sum / 2) - 1) : ((sum / 2));
        for(int i = start, j = end; i <= limit; i++, --j) {
            if(s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }

    private static boolean checkP(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int N = s.length();
        String first = s.substring(0, ((N - 1)/2));
        String second = s.substring(((N + 3)/2) - 1, N);
        boolean flag = checkP(first) && checkP(second) && checkP(s);
        System.out.println(flag ? "Yes" : "No");
    }
}