import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {



    public void run() {
        Scanner sc = new Scanner(System.in);
        char[] S = new StringBuilder(sc.next()).reverse().toString().toCharArray();
        int N = S.length;
        System.out.println(S);

        boolean ok = false;
        for (int i = 1; i < N; i++) {
            int len = N - i;
            if (len % 2 == 0) {
                ok = true;
                for (int j = i; j < i + len / 2; j++) {
                    //System.out.println(String.format("S[%d] = %s, S[%d] = %s", j, S[j], j + len / 2, S[j+len/2]));
                    if (S[j] != S[j + len / 2]) {
                        ok = false;
                        break;
                    }
                }

                if (ok) {
                    System.out.println(len);
                    return;
                }
            }
        }
        return;
    }

}