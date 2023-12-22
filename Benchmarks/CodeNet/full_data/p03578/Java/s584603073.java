
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        List<Long> D = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            D.add(sc.nextLong());
        }
        D.sort((o1, o2) -> (int) (o1 - o2));
        Long M = sc.nextLong();
        List<Long> T = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            T.add(sc.nextLong());
        }
        T.sort((o1, o2) -> (int) (o1 - o2));
        int current = 0;
        check:
        for (int i = 0; i < M; i++) {
            for (; current < N; current++) {
                if (T.get(i) == D.get(current)) {
                    current += 1;
                    continue check;
                }
                if (current == N - 1) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}
