

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flg = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((i % 2 == 1 && c == 'R') || (i % 2 == 0 && c == 'L')) {
                flg = false;
                break;
            }
        }

        if (flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}