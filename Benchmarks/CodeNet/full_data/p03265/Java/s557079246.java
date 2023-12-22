import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private int count2(int v, Map<Integer, Integer> m) {
        if (v % 2 == 1) return 0;
        else if (m.containsKey(v)) return m.get(v);
        else {
            int ret = (count2(v/2, m) + 1);
            m.put(v, ret);
            return ret;
        }
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int dx = x2 - x1;
        int dy = y2 - y1;

        int x3 = x2 - dy;
        int y3 = y2 + dx;

        int x4 = x1 - dy;
        int y4 = y1 + dx;

        System.out.println(String.format("%d %d %d %d", x3, y3, x4, y4));

        return;
    }

}