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
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String[] a = br.readLine().split(" ");
            int A = Integer.parseInt(a[0]);
            int B = Integer.parseInt(a[1]);
            map.merge(A, B, (old, add) -> old + add);
        }

        Map<Integer, Integer> sortedMap = map.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
        
        long quantity = 0;
        for (Map.Entry<Integer, Integer> entry: sortedMap.entrySet()) {
            long p = entry.getKey();
            long q = entry.getValue();
            if (quantity + q < M) {
                quantity += q;
                ans += p * q;
            } else {
                while (quantity < M) {
                    quantity++;
                    ans += p;
                }
            }
        };
        out.println(ans);
        out.close();
    }
}
