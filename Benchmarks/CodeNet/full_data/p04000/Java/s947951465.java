import java.util.*;

public class Main {
    static class Pair{
        public int x;
        public int y;
        public Pair(int x,int y) {
            this.x=x;
            this.y=y;
        }
        @Override
        public boolean equals(Object obj) {
            if(obj instanceof Pair) {
                Pair other = (Pair) obj;
                return other.x==this.x && other.y==this.y;
            }
            return false;
        }//同値の定義
        @Override
        public int hashCode() {
            return Objects.hash(this.x,this.y);
        }//これ書かないと正しく動作しない（要　勉強）
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());
        // HashMap<ArrayList<Integer>, Integer> map = new HashMap<ArrayList<Integer>, Integer>();
        HashMap<Pair, Integer> map = new HashMap<Pair, Integer>();
        for (int i=0;i<N;i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            for (int j=-1;j<=1;j++) {
                for (int k=-1;k<=1;k++) {
                    if (a+j<2 || a+j>H-1) continue;
                    if (b+k<2 || b+k>W-1) continue;
                    // ArrayList<Integer> add = new ArrayList<Integer>();
                    // add.add(a+j);
                    // add.add(b+k);
                    Pair add = new Pair(a+j, b+k);
                    if (map.containsKey(add)) {
                        map.put(add, map.get(add)+1);
                    } else {
                        map.put(add, 1);
                    }
                }
            }
        }
        ArrayList<Integer> val = new ArrayList<Integer>(map.values());
        long[] ans = new long[10];
        long sum = 0L;
        for (int i=0;i<val.size();i++) {
            sum++;
            ans[val.get(i)]++;
        }
        ans[0]=(long)(H-2)*(W-2)-sum;
        for (int i=0;i<10;i++) {
            System.out.println(ans[i]);
        }
        // System.out.println(map);
    }
}