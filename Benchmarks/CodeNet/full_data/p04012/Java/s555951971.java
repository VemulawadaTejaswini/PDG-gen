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
        boolean ok = true;
        String s = sc.next();
        int[] cnt = new int[27];
        for(int i=0;i<s.length();i++){
            cnt[s.charAt(i)-'a']++;
        }
        for(int i=0;i<27;i++){
            if(cnt[i]%2!=0)ok=false;
        }
        System.out.println(ok?"Yes":"No");
    }
}
