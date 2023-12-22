import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out))
        {
            final int N = in.nextInt();
            final int M = in.nextInt();

            final int[] P = new int[M];
            final int[] Y = new int[M];
            Map<Integer, Integer> yearIdxMap = new TreeMap<>();
            for (int i = 0; i < M; ++i) {
                P[i] = in.nextInt();
                Y[i] = in.nextInt();
                yearIdxMap.put(Y[i], i);
            }

            final String[] cityId = new String[M];
            final int[] seq = new int[N];
            for (int year : yearIdxMap.keySet()) {
                int i = yearIdxMap.get(year);
                cityId[i] = String.format("%06d%06d", P[i], ++seq[P[i] - 1]);
            }

            for (int i = 0; i < M; ++i) {
                out.println(cityId[i]);
            }
        }
    }
}
