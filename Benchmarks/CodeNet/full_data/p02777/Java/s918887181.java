

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), t = sc.next();
        int a = sc.nextInt(), b = sc.nextInt();
        String u = sc.next();

        if (u.equals(s)) {
            a--;
        } else {
            b--;
        }
        System.out.println(a + " " + b);
        sc.close();
    }
}