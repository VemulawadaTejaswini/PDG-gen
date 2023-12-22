import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long w = 0, x = 0, y = 0, z = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String t = s.replaceAll("AB", "X");
            w += s.length() - t.length();
            if (s.substring(0, 1).equals("B")) {
                if (s.substring(s.length() - 1, s.length()).equals("A")) {
                    x++;
                } else {
                    y++;
                }
            } else if (s.substring(s.length() - 1, s.length()).equals("A")) {
                z++;
            }
        }
        sc.close();
        if (x > 1) {
            w += x - 1;
            x = 1;
        }
        if (Math.max(x, Math.max(y, z)) == y) {
            w += x;
            w += z;
        } else if (Math.max(x, Math.max(y, x)) == z) {
            w += x;
            w += y;
        }
        System.out.println(w);
    }
}