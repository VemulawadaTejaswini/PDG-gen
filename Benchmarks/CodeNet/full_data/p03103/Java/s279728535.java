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
        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String[] a = br.readLine().split(" ");
            long A = Long.parseLong(a[0]);
            long B = Long.parseLong(a[1]);
            map.merge(A, B, (old, add) -> old + add);
        }

        Map<Long, Long> sortedMap = map.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
        
        long quantity = 0;
        for (Map.Entry<Long, Long> entry: sortedMap.entrySet()) {
            long p = entry.getKey();
            long q = entry.getValue();
            if (quantity + q < M) {
                quantity += q;
                ans += p * q;
            } else if (quantity < M) {
                while (quantity < M && q > 0) {
                    quantity++;
                    q--;
                    ans += p;
                }
            } else {
                out.println(ans);
                out.close();
                return;
            }
        };
    }
}
