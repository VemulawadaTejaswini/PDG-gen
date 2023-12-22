import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        long K = sc.nextLong();
        int Q = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < Q; i++) {
            A[sc.nextInt() - 1]++;
        }
        System.out.println(Arrays.stream(A).mapToLong(p -> K - Q + p).mapToObj(l -> l > 0 ? "Yes" : "No").collect(Collectors.joining("\n")));
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}