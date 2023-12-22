import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main implements Runnable {

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        List<Pair> pairs = new ArrayList<>();
        for (int i = 1; i < N; i++) {
            while (a[i - 1] > a[i]) {
                if (a[i - 1] > 0) {
                    pairs.add(new Pair(i, i + 1));
                    a[i] += a[i - 1];
                } else if (a[i] < 0) {
                    pairs.add(new Pair(i + 1, i));
                    a[i - 1] += a[i];
                }
            }
        }

        System.out.println(pairs.size());
        for (int i = 0; i < pairs.size(); i++) {
            System.out.println(pairs.get(i).x + " " + pairs.get(i).y);
        }
    }

    class Pair {

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int x;
        int y;
    }
}