import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String removedX = "";
        boolean[] isX = new boolean[S.length()];
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'x') {
                isX[i] = true;
            } else {
                removedX += S.charAt(i);
            }
        }
        for (int i = 0; i < removedX.length() / 2; i++) {
            if (removedX.charAt(i) != removedX.charAt(removedX.length() - i - 1)) {
                System.out.println(-1);
                return;
            }
        }/*
        int ans = 0;
        int head = 0;
        int foot = S.length() - 1;
        while (foot - head > 0) {
            if (isX[head] == isX[foot]) {
                head++;
                foot--;
            } else if (isX[head] && !isX[foot]) {
                head++;
                ans++;
            } else {
                foot--;
                ans++;
            }
        }
        System.out.println(ans);
        */
    }
}