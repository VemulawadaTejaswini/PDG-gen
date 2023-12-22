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

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        long H = sc.nextLong();
        long W = sc.nextLong();
        if(H==1 || W==1){
        System.out.println(1);
        return;
        }
        long ht = H/2+H%2;
        long hd = H/2;
        long wt = W/2+W%2;
        long wd = W/2;
        ans += ht*wt;
        ans += hd*wd;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
 