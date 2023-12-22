import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] p = new int[a];
        int[] q = new int[b];
        int[] r = new int[c];

        for (int i = 0; i < a; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            q[i] = sc.nextInt();
        }
        for (int i = 0; i < c; i++) {
            r[i] = sc.nextInt();
        }

        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);
        

        long ans = 0;
        int rid = c;
        while (true) {
            if (rid <= 0)
                break;
            boolean puse = false;
            boolean quse = false;

            long pscore = (a - x >= 0) ? p[a - x] : 0;
            long qscore = (b - y >= 0) ? q[b - y] : 0;

            if (x > 0 && pscore < r[rid - 1]) {
                puse = true;
            }
            if (y > 0 && qscore < r[rid - 1]) {
                quse = true;
            }


            if (puse && quse) {
                if (pscore > qscore) {
                    y--;
                    rid--;
                } else {
                    x--;
                    rid--;
                }
            } else if (puse) {
                x--;
                rid--;
            } else if (quse) {
                y--;
                rid--;
            } else {
                break;
            }
        }

        for(int i = a - x; i < a; i++) {
            ans += p[i];
        }
        for(int i = b - y; i < b; i++) {
            ans += q[i];
        }
        for (int i = rid; i < c; i++) {
            ans += r[i];
        }
        
        System.out.println(ans);
    }
}