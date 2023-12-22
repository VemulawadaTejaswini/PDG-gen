import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logic logic = new Logic1();
        long start = System.nanoTime();
        logic.solve(sc);
        long end = System.nanoTime();
//        System.out.println(((end - start)/1_000_000) + "ms");
    }
}


interface Logic {
    void solve(Scanner sc);
}

class Logic1 implements Logic {

    @Override
    public void solve(Scanner sc) {
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int K = sc.nextInt();

        long[] a = new long[X];
        long[] b = new long[Y];
        long[] c = new long[Z];

        for (int i=0; i<X; i++) {
            a[i] = sc.nextLong();
        }
        for (int i=0; i<Y; i++) {
            b[i] = sc.nextLong();
        }
        for (int i=0; i<Z; i++) {
            c[i] = sc.nextLong();
        }
        PriorityQueue<Long> queue1 = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i=0; i<X; i++) {
            for (int j=0; j<Y; j++) {
                queue1.add(a[i]+b[j]);
            }
        }
        PriorityQueue<Long> queue2 = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i=0; i<K; i++) {
            long e;
            if (queue1.size() > 0) {
                e = queue1.poll();
            } else {
                break;
            }
            for (int j=0; j<Z; j++) {
                queue2.add(e+c[j]);
            }
        }
        for (int i=0; i<K; i++) {
            System.out.println(queue2.poll());
        }
    }
}


class Logic2 implements Logic {

    @Override
    public void solve(Scanner sc) {

    }
}
