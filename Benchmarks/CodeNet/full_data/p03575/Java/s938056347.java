import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Set;
import java.util.HashSet;

public class Main {
    static int numOfNodes;
    static int numOfEdges;
    static boolean[][] graph;
    static int removeI;
    static int removeJ;
    static Set<Integer> visitedSet = new HashSet<>();

    public static void main(String[] args) throws IOException {
        try (InputReader reader = new InputReader(System.in)) {
            solve(reader);
        }
    }

    private static void solve(InputReader reader) throws IOException {
        int[] nm = reader.readIntsSplitByDelimiter(" ");
        numOfNodes = nm[0];
        numOfEdges = nm[1];
        graph = new boolean[numOfNodes][numOfNodes];
        for (int i = 0; i < numOfEdges; i++) {
            int[] edge = reader.readIntsSplitByDelimiter(" ");
            int x = edge[0] - 1;
            int y = edge[1] - 1;
            graph[x][y] = true;
            graph[y][x] = true;
        }

        int ans = 0;
        for (int i = 0; i < numOfNodes; i++) {
            for (int j = i + 1; j < numOfNodes; j++) {
                removeI = i;
                removeJ = j;

                visitedSet.clear();
                dfs(0);
                if (visitedSet.size() != numOfNodes) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }

    static void dfs(int position) {
        visitedSet.add(position);

        for (int i = 0; i < numOfNodes; i++) {
            if (i == removeI && position == removeJ || i == removeJ && position == removeI) {
                continue;
            }

            if (visitedSet.contains(i)) {
                continue;
            }

            if (graph[position][i]) {
                dfs(i);
            }
        }
    }
}

class Util {
    static int gcd(int m, int n) {
        int min = Math.min(m, n);
        int max = Math.max(m, n);
        while (min != 0) {
            int tmp = min;
            min = max % tmp;
            max = tmp;
        }

        return max;
    }

    static int lcm(int m, int n) {
        return m / gcd(m, n) * n;
    }
}

class InputReader implements Closeable, AutoCloseable {
    private final BufferedReader br;

    InputReader(InputStream inputStream) {
        this.br = new BufferedReader(new InputStreamReader(inputStream));
    }

    String readLine() throws IOException {
        return this.br.readLine();
    }

    int readInt() throws IOException {
        return Integer.parseInt(this.readLine());
    }

    long readLong() throws IOException {
        return Long.parseLong(this.readLine());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(this.readLine());
    }

    String[] readStringsSplitByDelimiter(String delimiter) throws IOException {
        return this.readLine().split(delimiter);
    }

    int[] readIntsSplitByDelimiter(String delimiter) throws IOException {
        String[] strings = this.readStringsSplitByDelimiter(delimiter);

        int stringsLength = strings.length;
        int[] ints = new int[stringsLength];
        for (int i = 0; i < stringsLength; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }

        return ints;
    }

    long[] readLongsSplitByDelimiter(String delimiter) throws IOException {
        String[] strings = this.readStringsSplitByDelimiter(delimiter);

        int stringsLength = strings.length;
        long[] longs = new long[stringsLength];
        for (int i = 0; i < stringsLength; i++) {
            longs[i] = Long.parseLong(strings[i]);
        }

        return longs;
    }

    double[] readDoublesSplitByDelimiter(String delimiter) throws IOException {
        String[] strings = this.readStringsSplitByDelimiter(delimiter);

        int stringsLength = strings.length;
        double[] doubles = new double[stringsLength];
        for (int i = 0; i < stringsLength; i++) {
            doubles[i] = Double.parseDouble(strings[i]);
        }

        return doubles;
    }

    @Override
    public void close() throws IOException {
        this.br.close();
    }
}
