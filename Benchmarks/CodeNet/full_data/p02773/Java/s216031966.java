import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }

        HashMap<String, Integer> m = new HashMap<String, Integer>();
        for (int i = 0; i < N; i++) {
            String s = S[i];
            if (m.containsKey(s)) {
                m.put(s, m.get(s) + 1);
            } else {
                m.put(s, 1);
            }
        }

        int max = 0;
        Set<String> set = new TreeSet<String>();
        for (Map.Entry e : m.entrySet()) {
            int cnt = (int) e.getValue();
            if (max < cnt) {
                set.clear();
                max = cnt;
            }
            if (max == cnt) {
                set.add((String)e.getKey());
            }
        }

        for (String s : set) {
            System.out.println(s);
        }

        return;
    }

}
