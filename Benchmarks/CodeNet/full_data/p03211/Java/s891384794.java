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
        String S = sc.next();
        int N = S.length();

        List<Integer> A = new ArrayList<Integer>();

        for (int i = 0; i + 2 < N; i++) {
            char ch1 = S.charAt(i);
            char ch2 = S.charAt(i + 1);
            char ch3 = S.charAt(i + 2);
            // i: base of parsing
            int v = (ch1 - '0') * 100;
            v += (ch2 - '0') * 10;
            v += (ch3 - '0') * 1;

            A.add(v);
        }


        int min = Integer.MAX_VALUE;
        for (int a : A) {
            min = Math.min(min, Math.abs(a - 753));
        }

        System.out.println(min);

        return;
    }

}