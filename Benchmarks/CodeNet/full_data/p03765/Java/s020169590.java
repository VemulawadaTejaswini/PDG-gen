import java.util.*;

public class Main {
    public void main(Scanner sc) {
        String s = sc.next();
        String t = sc.next();
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            System.out.println(query(s.substring(a - 1, b), t.substring(c - 1, d)) ? "YES" : "NO");
        }
    }

    private boolean query(String src, String dst) {
        src = src.replaceAll("B", "AA").replaceAll("AAA|BBB", "");
        dst = dst.replaceAll("B", "AA").replaceAll("AAA|BBB", "");

        return src.equals(dst);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
