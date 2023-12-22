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
        long K = sc.nextLong();

        int ans = 1;
        for (int i = 0; i < S.length; i++) {
            char ch = S[i];
            if (ch == '1') {
                if (K - 1 == i)  {
                    ans = 1;
                    break;
                }
            } else {
                ans = ch - '0';
                break;
            }

        }

        System.out.println(ans);
        return;
    }

}