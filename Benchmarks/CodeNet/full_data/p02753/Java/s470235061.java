

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int totalQueryCount = Integer.parseInt(scan.next());

        for (int i = 0; i < totalQueryCount; i++) {
            int query1 = Integer.parseInt(scan.next());
            if (query1 == 1) {
                s = t1(s);
            } else {
                int query2 = Integer.parseInt(scan.next());
                String query3 = scan.next();
                if (query2 == 1) {
                    s = t2f1(s, query3);
                } else {
                    s = t2f2(s, query3);
                }
            }
        }

        System.out.println(s);
        scan.close();
    }

    public static String t1(String s) {
        StringBuffer buffer = new StringBuffer(s);
        return buffer.reverse().toString();
    }

    public static String t2f1(String s, String input) {
        return input + s;
    }

    public static String t2f2(String s, String input) {
        return s + input;
    }

}
