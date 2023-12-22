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
        long ans = 1;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] sx = new int[N];
        int[] sy = new int[N];
        int[] cx = new int[M];
        int[] cy = new int[M];
        for(int i=0;i<N;i++){
            sx[i]=sc.nextInt();
            sy[i]=sc.nextInt();
        }
        for(int i=0;i<M;i++){
            cx[i]=sc.nextInt();
            cy[i]=sc.nextInt();            
        }
        for(int i=0;i<N;i++){
            int dist = Math.abs(sx[i]-cx[0])+Math.abs(sy[i]-cy[0]);
            int ck = 0;
            for(int j=1;j<M;j++){
                int nd = Math.abs(sx[i]-cx[j])+Math.abs(sy[i]-cy[j]);
                if(nd<dist){
                    ck=j;
                    dist=nd;
                }
            }
            System.out.println(ck+1);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
