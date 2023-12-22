import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<List<Shogen>> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            List<Shogen> s = new ArrayList<>();
            list.add(s);
            int A = sc.nextInt();
            for (int j = 0; j < A; j++) {
                int x = sc.nextInt()-1;
                int y = sc.nextInt();
                s.add(new Shogen(x, y));
            }
        }

        int ans = 0;
        int bit = 1 << N;
        for (int i = 0; i < bit; i++) {
            if (ok(list, i)) {
                int count = 0;
                int tmp = i;
                while (tmp > 0) {
                    if (tmp%2 == 1) {
                        count++;
                    }
                    tmp /= 2;
                }
                ans = Math.max(ans, count);
            }
        }

        System.out.println(ans);
    }

    private static boolean ok(List<List<Shogen>> list, int bit) {
        int i  = 0;
        int tmp = bit;
        while (tmp > 0) {
            if (tmp%2 == 1) {
                // check
                List<Shogen> ss = list.get(i);
                for (Shogen s: ss) {
                    if ((s.y == 1 && (bit>>s.x)%2 == 1)
                        || (s.y == 0 && (bit >> s.x)%2 == 0)) {
                        // OK
                    } else {
                        return false;
                    }
                }
            }
            tmp /= 2;
            i++;
        }
        return true;
    }

    private static class Shogen {
        int x;
        int y;
        Shogen(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

