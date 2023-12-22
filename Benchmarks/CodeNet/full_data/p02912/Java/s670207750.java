import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        PriorityQueue<Long> A = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < N; i++) {
            A.add(sc.nextLong());
        }
        for (int i = 0; i < M; i++) {
            Long peek = A.remove();
            A.add((long) Math.ceil(peek * 0.5));
        }
        System.out.println(A.stream().mapToLong(i -> i).sum());
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}