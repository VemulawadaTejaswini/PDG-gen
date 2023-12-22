import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char prev;

        int n1 = 0;
        prev = '0';
        for (char s : S.toCharArray()) {
            if (prev != s) {
                n1 += 1;
            }
            prev = switchPrev(prev);
        }

        int n2 = 0;
        prev = '1';
        for (char s : S.toCharArray()) {
            if (prev != s) {
                n2 += 1;
            }
            prev = switchPrev(prev);
        }

        if (n1 < n2) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
    }

    private static char switchPrev(char prev) {
        if (prev == '0') {
            return '1';
        } else {
            return '0';
        }
    }

}
