import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.HashSet;

public class Main {

    static long gcd(long p, long q) { if(q == 0) return p; return gcd(q, p % q);}
    static Scanner sc = new Scanner(System.in);
    /////////

    static int ret = 0;
    static String str;

    static boolean check(int mid) {
        HashSet<String> hash = new HashSet<>();

        for(int i = 0; i < str.length(); i += mid) {
            if(i + mid > str.length()) break;
            if(hash.contains(str.substring(i, i + mid))) {
                return true;
            }
            hash.add(str.substring(i, i + mid));
        }


        return false;
    }

    static void parametric_search(int l, int r) {
        if(r < l) return;

        int mid = l + (r - l) / 2;
        if(check(mid)) {
            ret = Math.max(ret, mid);
            parametric_search(mid + 1, r);
        } else {
            parametric_search(l, mid - 1);
        }
    }


    public static void main(String[] args) {
        int N = sc.nextInt(); str = sc.next();

        parametric_search(1, N);

        System.out.println(ret);
    }
}
//[B@25618e91
//[B@326de728
//