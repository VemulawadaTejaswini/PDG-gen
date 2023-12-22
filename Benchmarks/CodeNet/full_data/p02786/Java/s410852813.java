import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private long calc(long H, Map<Long, Long> map) {
        if (map.containsKey(H)) {
            return map.get(H);
        }

        long nr = calc(H/2, map) + calc(H/2, map) + 1;
        map.put(H, nr);

        return nr;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();

        Map<Long, Long> map = new HashMap<Long, Long>();
        map.put(0L, 0L);
        map.put(1L, 1L);

        long ret = calc(H, map);
        System.out.println(ret);

        return;
    }

}