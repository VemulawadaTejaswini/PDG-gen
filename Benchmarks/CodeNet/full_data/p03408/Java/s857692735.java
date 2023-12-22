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
        List<String> list = new ArrayList<>();
        String[] s = new String[N];
        for (int i = 0; i < N; i++) {
            s[i] = sc.next();
            list.add(s[i]);
        }

        int M = sc.nextInt();
        String[] t = new String[M];
        for (int i = 0; i < M; i++) {
            t[i] = sc.next();
            list.add(t[i]);
        }

        int max = 0;
        for (String card : list) {
            int cnt = 0;
            for (int i = 0; i < s.length; i++) {
                if (card.equals(s[i])) {
                    cnt++;
                }
            }
            for (int j = 0; j < t.length; j++) {
                if (card.equals(t[j])) {
                    cnt--;
                }
            }
            max = Math.max(max, cnt);
        }

        System.out.println(max);
        return;
    }

}