import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        long ans = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            String[] a = br.readLine().split(" ");
            int A = Integer.parseInt(a[0]);
            int B = Integer.parseInt(a[1]);
            map.merge(A, B, (old, add) -> old + add);
        }

        Map<Integer, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            long p = entry.getKey();
            long q = entry.getValue();
            if (q < M) {
                M -= q;
                ans += p * q;
            } else {
                ans += p * M;
                M = 0;
                out.println(ans);
                out.close();
            }
        }
        ;
    }
}
