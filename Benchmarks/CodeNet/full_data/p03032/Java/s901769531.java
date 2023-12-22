import java.util.*;

public class Main {

    private static int N;
    private static int K;
    private static Deque<Integer> V;

    private static void read() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        V = new LinkedList<>();
        for (int i = 0; i < N; i += 1) {
            V.add(sc.nextInt());
        }
    }

    public static void main(String[] args) {
        read();
        solve();
    }

    private static void solve() {
        int R = Integer.min(N, K);

        int max = Integer.MIN_VALUE;
        for (int r = 0; r <= R; r += 1) { // `r`: count of picking gems
            for (int A = 0; A <= r; A += 1) { // `A: count of picking from left
                int B = r - A;  // `B: count of picking from right
                int D = K - A - B; // `D: count of disposed gems

                Deque<Integer> copyV = new LinkedList<>(V);

                List<Integer> gems = new ArrayList<>();
                for (int i = 0; i < A; i +=1) {
                    gems.add(copyV.removeFirst());
                }
                for (int i = 0; i < B; i +=1) {
                    gems.add(copyV.removeLast());
                }

                Collections.sort(gems);
                for (int i = 0; i < D; i += 1) {
                    if (!gems.isEmpty() && gems.get(0) < 0) {
                        gems.remove(0);
                    }
                }

                int tmpMax = 0;
                for (int gem : gems) {
                    tmpMax += gem;
                }
                max = Integer.max(max, tmpMax);
            }
        }

        System.out.println(max);
    }

}
