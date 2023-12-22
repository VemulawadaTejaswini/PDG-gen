import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N + 1];
        int[] w = new int[N + 1];
        int[] s = new int[N + 1];
        int[] indice = new int[N];

        a[0] = 0;
        for (int i = 1; i <= N; i++) {
            a[i] = sc.nextInt();
        }
        //System.arraycopy(a, 0, w, 0, N + 1);
        //System.arraycopy(a, 0, s, 0, N + 1);
        //Arrays.sort(s);

        int nr_breaks = 0;
        int cur = 1;
        for (int i = 1; i <= N; i++) {
            //System.out.print("s:" + a[i]);
            //System.out.println(", c:" + cur);
            if (a[i] == cur) {
                cur++;
                //System.out.println("c:" + cur);
            } else {
                nr_breaks++;
                //System.out.println("b:" + nr_breaks);
            }
        }

        if (nr_breaks == N) {
            System.out.println(-1);
        } else {
            System.out.println(nr_breaks);
        }

        // start to run algorithm.
        // N = 5,
        // a: 1 2 3 4 5
        // s: 1 2 3 4 5
        // -> 0.
        //
        // a: 5 5 5 3 1
        // s: 1 3 5 5 5
        // -> 4.
        //
        // a: 2 2 2 3 1
        // s: 1 2 2 2 3
        // -> 4.



    }
}
