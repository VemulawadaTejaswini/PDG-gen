import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            long[] A = new long[N];
            long[] B = new long[N];
            ArrayList<A> As = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
                B[i] = in.nextInt();
                As.add(new A(A[i], B[i], i));
            }
            Collections.sort(As, new Comparator<A>() {
                @Override
                public int compare(A o1, A o2) {
                    if (o1.a - o1.b < o2.a - o2.b) {
                        return -1;
                    }
                    if (o1.a - o1.b > o2.a - o2.b) {
                        return 1;
                    }
                    if (o1.a < o2.a) {
                        return 1;
                    }
                    if (o1.a > o2.a) {
                        return -1;
                    }
                    if (o1.b < o2.b) {
                        return -1;
                    }
                    if (o1.b > o2.b) {
                        return 1;
                    }
                    return 0;
                }
            });

            long sum = 0;
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    sum += As.get(i).a;
                } else {
                    sum -= As.get(i).b;
                }
//                Utils.debug(i, sum, As.get(i).a, As.get(i).b, As.get(i).i);
            }

            System.out.println(sum);
        }
    }
}

class A {
    long a;
    long b;
    int i;

    public A(long a, long b, int i) {
        super();
        this.a = a;
        this.b = b;
        this.i = i;
    }
}