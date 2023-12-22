import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    private static int MOD = 1000000007;


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Integer n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        Queue<Integer> rs = new ArrayDeque<>();
        Queue<Integer> gs = new ArrayDeque<>();
        Queue<Integer> bs = new ArrayDeque<>();

        Map<Integer, Base> colorMap = new HashMap<>();

        int i = 1;
        for (char c : str.toCharArray()) {
            if (c == 'R') {
                rs.add(i);
                colorMap.put(i, new Base(rs, gs, bs));
            } else if (c == 'G') {
                gs.add(i);
                colorMap.put(i, new Base(gs, bs, rs));
            } else {
                bs.add(i);
                colorMap.put(i, new Base(bs, rs, gs));
            }
            i++;
        }

        int min = Math.min(rs.size(), Math.min(bs.size(),gs.size()));

        long total = 0;
        int sub = 1;
        int ri, gi, bi = 0;
        for (int j = 1; j <= n; j++) {
            Base base = colorMap.get(j);
            int first = base.base.poll();
            int an1 = base.another1.size();
            int an2 = base.another2.size();

            total += an1 * an2;
        }
        System.out.println(total - (min * min));
    }

    static class Base {
        Queue<Integer> base;
        Queue<Integer> another1;
        Queue<Integer> another2;

        public Base(Queue<Integer> base, Queue<Integer> another1, Queue<Integer> another2) {
            this.base = base;
            this.another1 = another1;
            this.another2 = another2;
        }
    }

}
