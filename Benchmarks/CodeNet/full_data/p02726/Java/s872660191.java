import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    private static int MOD = 1000000007;


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        String[] split = str.split(" ");
        int n = Integer.parseInt(split[0]);
        int x = Integer.parseInt(split[1]);
        int y = Integer.parseInt(split[2]);

        Map<Integer, List<ISet>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int dist = j - i; //別経路を通らない場合
                int s = another(i, j, x, y);
                //距離が短いほうを設定
                dist = s < dist ? s : dist;
                List<ISet> iSets = map.get(dist);
                if(iSets == null) {
                    iSets = new ArrayList<>();
                }
                iSets.add(new ISet(j, i));
                map.put(dist, iSets);
            }
        }


        for(int i = 1; i < n ; i++){
            List<ISet> iSets = map.get(i);
            if (iSets == null) {
                System.out.println(0);
                continue;
            }
            System.out.println(iSets.size());
        }
    }

    private static int another(int s, int e, int x, int y) {
        return Math.abs(x - s) + Math.abs(y - e) + 1;
    }


    static class ISet {
        int a;
        int b;

        public ISet(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public boolean contain(int x, int y) {
            return a <= x && y <= b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ISet iSet = (ISet) o;
            return a == iSet.a &&
                    b == iSet.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }

        @Override
        public String toString() {
            return "ISet{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }
    }

}
