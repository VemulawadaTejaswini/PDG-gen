import java.util.*;
import java.text.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();
        Pair[] pairs = new Pair[m];
        for (int i=0; i<m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            pairs[i] = new Pair(l, r);
        }

        Arrays.sort(pairs);

        int cnt = 1;

        int point = pairs[0].r;

        for (int i=1; i<m; i++) {
            if (pairs[i].l < point && point <= pairs[i].r) {

            } else {
                point = pairs[i].r;
                cnt++;
            }
        }

        System.out.println(cnt);

    }

    class Pair implements Comparable<Pair>{
        int l;
        int r;
        public Pair(int l, int r) {
            this.l = l;
            this.r = r;
        }

        public int compareTo(Pair pair) {
            if (this.r < pair.r) return -1;
            if (pair.r < this.r) return 1;
            return 0;
        }
    }


}
