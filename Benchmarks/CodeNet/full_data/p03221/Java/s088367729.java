import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter writer = new PrintWriter(System.out)) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            int[] ps = new int[m];
            int[] ys = new int[m];
            HashMap<Integer, List<Integer>> pyMap = new HashMap<>(n);

            for (int i = 0; i < m; i++) {
                input = br.readLine().split(" ");
                ps[i] = Integer.parseInt(input[0]);
                ys[i] = Integer.parseInt(input[1]);

                List<Integer> pylist = pyMap.getOrDefault(ps[i], new ArrayList<Integer>(m));
                pylist.add(ys[i]);
                pyMap.put(ps[i], pylist);
            }

            for (Integer key : pyMap.keySet()) {
                Collections.sort(pyMap.get(key));
            }

            for (int i = 0; i < m; i++) {
                int order = Collections.binarySearch(pyMap.get(ps[i]), ys[i]) + 1;
                writer.printf("%06d%06d%n", ps[i], order);
            }
            writer.flush();
        }
    }
}
