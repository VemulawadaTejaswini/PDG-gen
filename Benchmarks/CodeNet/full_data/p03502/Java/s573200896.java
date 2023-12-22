import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int s = 0;
        for (int i = 0; i < N.length(); i++) {
            s+=N.charAt(i)-'0';
        }

        System.out.println(Integer.parseInt(N)%s==0?"Yes":"No");
    }

    public static void main(String[] args) {
        new Main();
    }
}
