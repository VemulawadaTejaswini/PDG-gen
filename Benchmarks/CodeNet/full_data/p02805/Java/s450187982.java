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
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        
        for(int i=0;i<N;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        double ans = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                double dist = Math.sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j]));
                ans = Math.max(ans,dist);
            }
        }
        System.out.println(ans/2);
    }
}