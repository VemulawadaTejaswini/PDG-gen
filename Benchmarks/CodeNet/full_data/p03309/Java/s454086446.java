
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Arrays;
/* static int java.util.Arrays.binarySearch(int[] a, int key); */
import java.math.BigDecimal;
/* static int java.util.Arrays.binarySearch(int[] a, int key); */


public class Main {
    Scanner sc = new Scanner(System.in);
    int n;
    public void run(){
        n = sc.nextInt();
        solve();
    }
    public void solve(){
        long[] a = new long[n];

        for(int i = 0; i < n; i++){
            long na = sc.nextLong();
            a[i] = na - (i + 1);
        }
        Arrays.sort(a);

        /*long ans = Long.MAX_VALUE;

        long low = a[0];
        long high = a[n-1];
        long highsum = 0;
        long lowsum = 0;
        while(low <= high){
            long mid = ( low + high) / 2;
            highsum = 0;
            lowsum = 0;
            for(int i = 0; i < n; i++){
                if(mid < a[i]){
                    highsum += a[i] - mid;
                }
                else{
                    lowsum += mid - a[i];
                }
            }
            if(highsum + lowsum <= ans){
                ans = highsum + lowsum;
            }

            if(highsum == lowsum){
                break;
            }
            else if(highsum > lowsum){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }

        }*/

        long b1 = a[(n /2) - 1];
        long b2 = a[(n/2) + 1];

        long ans1 = 0;
        long ans2 = 0;

        for(int i = 0; i < n; i++){
            ans1 += Math.abs(a[i] - b1);
            ans2 += Math.abs(a[i] - b2);
        }

        long ans = ans1;
        if(ans2 < ans1) ans = ans2;

        System.out.println(ans);
    }

    public static void main(String[] args){
        new Main().run();
    }

    static class Pair {
        int first,second;
        public Pair(int a,int b) {
            this.first = a;
            this.second = b;
        }
    }
    static class Edge{
        int to, cost;
        public Edge(int a, int b){
            this.to = a;
            this.cost = b;
        }
    }
    class MyComparator implements Comparator {
        @Override
        public int compare (Object arg0, Object arg1) {
            int x = ((Pair)arg0).first;
            int y = ((Pair)arg1).first;

            if (x < y) {
                return 1;
            } else if (x > y) {
                return -1;
            } else{
                return 0;
            }
        }
    }
    static class UnionFind{
        int par[];
        int rank[];

        //n要素で初期化
        public UnionFind(int maxn){
            par = new int[maxn];
            rank = new int[maxn];

            for(int i = 0; i < maxn; i++){
                par[i] = i;
                rank[i] = 0;
            }
        }

        //木の根を求める
        int find(int x){
            if(par[x] == x){
                return x;
            }
            else {
                return par[x] = find(par[x]);
            }
        }

        // xとyの属する集合を併合
        void unite (int x, int y){
            x = find(x);
            y = find(y);
            if(x == y){
                return;
            }

            if(rank[x] < rank[y]){
                par[x] = y;
            }
            else{
                par[y] = x;
                if(rank[x] == rank[y]) rank[x]++;
            }
        }

        // xとyが同じ集合に属するか否か
        boolean same(int x, int y){
            return find(x) == find(y);
        }
    }

}