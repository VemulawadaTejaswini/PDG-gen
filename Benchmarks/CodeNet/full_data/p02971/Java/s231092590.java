import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solver {
    void solve(Scanner sc) {
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] sorted = new int[N];
        for (int i = 0; i < N; i++) {
            sorted[i] = A[i] = sc.nextInt();
        }

        Arrays.sort(sorted);
        int largest = sorted[sorted.length - 1];
        int larger = sorted[sorted.length - 2];
        System.out.println(Arrays.stream(A).map(i -> i == largest ? larger : largest).mapToObj(String::valueOf).collect(Collectors.joining("\n")));
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        new Solver().solve(in);

        in.close();
    }
}