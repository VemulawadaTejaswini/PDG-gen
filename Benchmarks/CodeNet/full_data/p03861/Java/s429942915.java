import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        long A = sc.nextLong()-1;
        long B = sc.nextLong();
        long X = sc.nextLong();
        if(A==-1){
            ans = B/X + 1;
        }else{
            ans = B/X-A/X;
        }
        System.out.println(ans);
    }
}
