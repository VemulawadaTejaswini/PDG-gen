import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        int N = S.length;

        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                if (S[i] != '0') cnt1++;
                if (S[i] != '1') cnt2++;
            } else {
                if (S[i] != '1') cnt1++;
                if (S[i] != '0') cnt2++;
            }
        }

        System.out.println(Math.min(cnt1, cnt2));
        return;
    }

}