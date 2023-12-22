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
        int N = sc.nextInt();
        if(N==1){
            System.out.println(1);
            return;
        }
        long p1 = 2;
        long p2 = 1;
        for (int i = 1; i < N; i++) {
            long np = p1+p2;
            p1 = p2;
            p2 = np;
        }

        System.out.println(p2);
    }

    public static void main(String[] args) {
        new Main();
    }
}
