import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j < S.length(); j++) {
                if (S.charAt(i) == S.charAt(j)) {
                    System.out.println("no");
                    return;
                }
            }
        }
        System.out.println("yes");
    }
}
