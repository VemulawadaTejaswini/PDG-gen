
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    Scanner sc = new Scanner(System.in);
    String s;
    public void run(){
        s = sc.next();
        solve();
    }
    public void solve(){
        int ans = 0;
        if(s.substring(0, 1).equals("A")){
            int c = -1;
            for(int i = 2; i < s.length() - 1; i++) {
                if (s.substring(i, i + 1).equals("C")) {
                    c = i;
                    break;
                }
            }
            if(c != -1) {
                int flag = 1;
                for (int i = 1; i < s.length(); i++) {
                    if (i != c) {
                        char t = s.charAt(i);
                        if (t == 'a' || t == 'b' || t == 'c' || t == 'd' || t == 'e' || t == 'f'
                                || t == 'g' || t == 'h' || t == 'i' || t == 'j' || t == 'k' || t == 'l'
                                || t == 'm' || t == 'n' || t == 'o' || t == 'p' || t == 'q' || t == 'r'
                                || t == 's' || t == 't' || t == 'u' || t == 'v' || t == 'w' || t == 'x'
                                || t == 'y' || t == 'z') {

                        } else {
                            flag = -1;
                        }
                    }
                }
                if(flag != -1) ans = 1;
            }
        }


        if(ans == 0){
            System.out.println("WA");
        }
        else{
            System.out.println("AC");
        }
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