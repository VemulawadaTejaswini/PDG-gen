import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        Map<Integer, Integer> max = new HashMap<>();
        Map<Integer, Integer> min = new HashMap<>();
        max.put(0, 0);
        min.put(0, 0);

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> nmax = new HashMap<>();
            Map<Integer, Integer> nmin = new HashMap<>();
            int x = in.nextInt(), y = in.nextInt();
            for (Map.Entry<Integer, Integer> ent : max.entrySet()) {
                int nx = ent.getKey() + x, ny = ent.getValue() + y;
                if (!max.containsKey(nx) || max.get(nx) < ny) {
                    nmax.merge(nx, ny, Math::max);
                }
            }
            for (Map.Entry<Integer, Integer> ent : min.entrySet()) {
                int nx = ent.getKey() + x, ny = ent.getValue() + y;
                if (!min.containsKey(nx) || min.get(nx) > ny) {
                    nmin.merge(nx, ny, Math::min);
                }
            }
            max.putAll(nmax);
            min.putAll(nmax);
        }
        double ans = 0;
        for (Map.Entry<Integer, Integer> ent : max.entrySet()) {
            ans = Math.max(ans, Math.sqrt(ent.getKey() * (double) ent.getKey() + ent.getValue() * (double) ent.getValue()));
        }
        for (Map.Entry<Integer, Integer> ent : min.entrySet()) {
            ans = Math.max(ans, Math.sqrt(ent.getKey() * (double) ent.getKey() + ent.getValue() * (double) ent.getValue()));
        }
        out.println(ans);
        out.close();
    }
}
