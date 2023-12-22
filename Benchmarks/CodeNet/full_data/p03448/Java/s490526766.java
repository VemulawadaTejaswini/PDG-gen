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

    Main() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int ans = 0;
        for(int a=0;a<=A;a++){
            for(int b=0;b<=B;b++){
                for(int c=0;c<=C;c++){
                    if(500*a+100*b+50*c==X)ans++;
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
