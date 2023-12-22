import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {
        int n = sc.nextInt();
        int d = sc.nextInt();
        int a = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i=0; i<n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (x, y) -> x[0] - y[0]);

//        System.out.println(arr[2][0]);

        Queue<Pair> queue = new ArrayDeque<>();

        int i = 0;
        long ans = 0;
        long accD = 0;

        while (i < n) {
            while (!queue.isEmpty()) {
                Pair p = queue.peek();
                if (p.x >= arr[i][1]) break;
                accD -= p.damage;
                queue.poll();
            }

            arr[i][1] -= accD;
//            System.out.println(accD);

            if (arr[i][1] > 0) {
                long attack = (arr[i][1] + a - 1) /  a;
                ans += attack;
                queue.add(new Pair((arr[i][0] + 2 * d), attack * a));
                accD += attack * a;
            }
            i++;
//            System.out.println(ans);
//            System.out.println(accD);
        }

        System.out.println(ans);


    }

    class Pair {
        long x;
        long damage;
        public Pair(long x, long d) {
            this.x = x;
            this.damage = d;
        }
    }

}
