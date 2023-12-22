
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long rep = sc.nextInt();
        char[] sq = S.toCharArray();
        long ans = 0;
        for (int i = 1; i < sq.length; i++) {
            if (sq[i - 1] == sq[i]) {
                sq[i] = '.';
                ans++;
            }
        }
        if (rep == 1) {
            System.out.println(ans);
            return;
        }
        long qp = 0;
        long na = ans;
        ArrayList<Long> rem = new ArrayList<Long>();
        while (sq[0] == sq[sq.length - 1]) {
            rem.add(na);
            qp++;
            String ns = new String(sq) + S;
            sq = ns.toCharArray();
            for (int i = (int) qp * S.length(); i < sq.length; i++) {
                if (sq[i - 1] == sq[i]) {
                    sq[i] = '.';
                    na++;
                }
            }
            // ans = ans * (rep / 2) + a1 * (rep % 2);
            // System.out.println(new String(sq2));
        }
        if (qp != 0)
            System.out.println(ans * (rep / qp) + rem.get((int) (rep % qp)));
        else
            System.out.println(ans * rep);
    }
}