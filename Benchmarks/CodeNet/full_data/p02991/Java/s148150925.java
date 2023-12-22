import java.util.*;

public class Main{
    static MyPoint mps[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        mps = new MyPoint[N+1];
        for(int t=0; t<=N; t++) {
            mps[t] = new MyPoint(t);
        }
        for(int s=1; s<=M; s++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            mps[u].addEdge(v);
        }
        int S = sc.nextInt();
        int T = sc.nextInt();

        mps[S].check(0, 0);
        int tmp = mps[T].minStemps[0];
        if(tmp == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(tmp / 3);
        }
    }

    static class MyPoint {
        final int index;
        final List<Integer> edges = new ArrayList<>();
        int minStemps[] = new int[3];

        MyPoint(int i) {
            this.index = i;
            for(int t=0; t<3; t++) {
                minStemps[t] = Integer.MAX_VALUE;
            }
        }
        void addEdge(int x) {
            edges.add(x);
        }

        void check(int mod, int step) {
            if(minStemps[mod] <= step) return;
            minStemps[mod] = step;
            int newmod = (mod + 1) % 3;
            for(Integer k : edges) {
                mps[k].check(newmod, step+1);
            }
       }
    }
}