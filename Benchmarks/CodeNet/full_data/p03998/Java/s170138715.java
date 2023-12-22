import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] sa = scan.next().toCharArray();
        char[] sb = scan.next().toCharArray();
        char[] sc = scan.next().toCharArray();

        int ai = 0;
        int bi = 0;
        int ci = 0;

        char card = sa[ai];
        ai++;
        if (ai == sa.length) {
            System.out.println('A');
            return;
        }

        char winner = 'Z';
        while (true) {
            int next = 0;
            switch (card) {
                case 'a':
                    next = ai;
                    ai++;
                    if (ai == sa.length) {
                        winner = 'A';
                    } else {
                        card = sa[ai];
                    }
                    break;
                case 'b':
                    next = bi;
                    bi++;
                    if (bi == sb.length) {
                        winner = 'B';
                    } else {
                        card = sb[bi];
                    }
                    break;
                case 'c':
                    next = ci;
                    ci++;
                    if (ci == sc.length) {
                        winner = 'C';
                    } else {
                        card = sc[ci];
                    }
                    break;
                default:
                    System.exit(1);
            }

            if (winner != 'Z') break;
        }

        System.out.println(winner);

    }
}