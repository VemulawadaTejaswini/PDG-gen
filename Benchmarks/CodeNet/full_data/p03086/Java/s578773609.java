import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();

        int maxlen = 0;
        int i = 0;
        while (i < N) {
            int len = 0;
            char ch = S.charAt(i);
            while (i < N && (ch == 'A' || ch == 'C' || ch == 'G' || ch == 'T')) {
                len++;
                maxlen = Math.max(len, maxlen);

                i++;
                if (i < N) ch = S.charAt(i);
            }
            i++;
        }

        System.out.println(maxlen);

        return;
    }

}