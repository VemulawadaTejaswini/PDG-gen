import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int max = 0;
        for (int i = 1; i < S.length() / 2; i++) {
            if (S.substring(0, i).equals(S.substring(i, 2 * i))) {
                max = 2 * i;
            }
        }
        System.out.println(max);
    }
}
