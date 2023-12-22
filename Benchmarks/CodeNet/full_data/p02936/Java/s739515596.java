import java.io.PrintWriter;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solver {
    void solve(Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int Q = in.nextInt();
        BitSet[] sets = new BitSet[N];
        for (int i = 1; i < N; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;

            BitSet bs = sets[a];
            if (bs == null) bs = sets[a] = new BitSet();
            bs.set(b);
        }
        int[] result = new int[N];
        for (int i = 0; i < Q; i++) {
            int p = in.nextInt() - 1;
            int x = in.nextInt();
            result[p] += x;
        }
        for (int i = 0; i < result.length; i++) {
            BitSet bs = sets[i];
            if (bs == null) continue;
            for (int j = bs.nextSetBit(0); j >= 0; j = bs.nextSetBit(j + 1)) {
                result[j] += result[i];
            }
        }
        out.println(Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}

class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        new Solver().solve(in, out);

        in.close();
        out.flush();
    }
}