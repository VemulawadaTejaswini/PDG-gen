import java.lang.Math;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Pair {
    public final int x;
    public final int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Main {
    static Map<Integer, Pair> map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
        map = new HashMap<>();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                map.put(sc.nextInt(), new Pair(i, j));
            }
        }

        int Q = sc.nextInt();
        for (int q = 0; q < Q; q++) {
            long answer = 0;
            int START = sc.nextInt();
            int GOAL = sc.nextInt();

            int now = START;

            while (now != GOAL) {
                answer += singleHopCost(now, now + D);
                now += D;
            }

            System.out.println(answer);
        }
    }

    public static int singleHopCost(int l, int r) {
        Pair lPoint = map.get(l);
        Pair rPoint = map.get(r);

        return Math.abs(lPoint.x - rPoint.x) + Math.abs(lPoint.y - rPoint.y);
    }
}
