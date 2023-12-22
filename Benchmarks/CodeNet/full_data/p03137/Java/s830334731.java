import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] X = new int[M];
        int[] D = new int[M];
        for(int i=0;i<M;i++){
            X[i]=sc.nextInt();
        }
        Arrays.sort(X);
        for(int i=1;i<M;i++){
            D[i]=X[i]-X[i-1];
        }
        System.err.println(Arrays.toString(X));
        System.err.println(Arrays.toString(D));
        Arrays.sort(D);
        for(int i=0;i<=M-N;i++){
            ans += D[i];
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
