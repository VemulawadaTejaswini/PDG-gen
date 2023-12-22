import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Main {
    public void solve(BufferedReader stdin, PrintWriter stdout) throws NumberFormatException, IOException {
        int n = Integer.parseInt(stdin.readLine());
        int[] a = toIntArray(stdin.readLine());
        int[] b = toIntArray(stdin.readLine());

        TreeMap<Integer, Integer> d = new TreeMap<>();
        Arrays.stream(a).forEach(k -> d.put(k, d.getOrDefault(k, 0) + 1));

        int[] c = new int[n];
        int[] idxs = IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> b[i])).mapToInt(Integer::intValue).toArray();

        for (int i : idxs) {
            if (a[i] <= b[i] && d.containsKey(a[i])) {
                c[i] = a[i];
                if (d.get(a[i]) == 1) {
                    d.remove(a[i]);
                } else {
                    d.put(a[i], d.get(a[i]) - 1);
                }
            } else {
                Integer k = d.floorKey(b[i]);
                if (k == null) {
                    stdout.println("No");
                    return;
                }

                if (d.get(k) == 1) {
                    d.remove(k);
                } else {
                    d.put(k, d.get(k) - 1);
                }
                c[i] = k;
            }
        }

        int x = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != c[i]) {
                x++;
            }
        }

        int y = (x % 2 == 0) ? x / 2 : x / 2 + 1;
        stdout.println(y <= n - 2 ? "Yes" : "No");
    }

    private Pattern space = Pattern.compile(" ");

    private int[] toIntArray(String line) {
        return space.splitAsStream(line).mapToInt(Integer::parseInt).toArray();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter stdout = new PrintWriter(System.out, false);
        new Main().solve(stdin, stdout);
        stdout.flush();
    }
}