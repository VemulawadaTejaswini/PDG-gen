import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        String s = sc.next();

        int head = 0;
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ')') {
                if (tmp > 0) {
                    tmp--;
                } else {
                    head++;
                }
            } else {
                tmp++;
            }
        }

        int foot = 0;
        tmp = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                if (tmp > 0) {
                    tmp--;
                } else {
                    foot++;
                }
            } else {
                tmp++;
            }
        }

        for (int i = 0; i < head; i++) {
            System.out.print("(");
        }
        System.out.print(s);
        for (int i = 0; i < foot; i++) {
            System.out.print(")");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
