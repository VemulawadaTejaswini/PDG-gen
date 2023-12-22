import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    List<Pair> list = new ArrayList<>();

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[][] dp = new int[n+1][n+1];
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            Pair tmpP = new Pair(i, arr[i]);
            list.add(tmpP);
        }

        Collections.sort(list, (o1, o2) -> Integer.compare(o2.power, o1.power));

//        System.out.println(list.get(0).power);

        long ans = 0;


        label:
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (n <= i +j) continue label;
                Pair tmp = list.get(i + j);
                dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j]+(tmp.idx-i)*tmp.power);
                dp[i][j+1] = Math.max(dp[i][j+1], dp[i][j]+(n-1-j-tmp.idx)*tmp.power);
            }
        }

        for (int i=0; i<=n; i++) {
            ans = Math.max(ans, dp[i][n-i]);
        }

        System.out.println(ans);

    }

    class Pair implements Comparable<Pair> {
        int idx;
        int power;
        public Pair(int i, int p) {
            this.idx = i;
            this.power = p;
        }

        public int compareTo(Pair pair) {
            if (this.power < pair.power) return 1;
            if (pair.power < this.power) return -1;
            return 0;
        }
    }
}
