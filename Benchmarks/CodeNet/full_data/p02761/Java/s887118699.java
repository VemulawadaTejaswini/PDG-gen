import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        P[] Ps = new P[M];

        for (int m = 0; m < M; m++) {
            P p = new P();
            p.s = in.nextInt();
            p.c = in.nextInt();
            Ps[m] = p;
        }

        for (int i = (int) Math.pow(10, N - 1); i < Math.pow(10, N); i++) {
            boolean b = true;
            for (P p : Ps) {
                if (get(i, p.s) != p.c) {
                    b = false;
                    break;
                }
            }

            if (b) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }

    private static int get(int a, int s) {
        String as = Integer.toString(a);
        return Integer.parseInt(as.substring(s - 1, s));
    }
}

class P {
    public int s;
    public int c;
}

