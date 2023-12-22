import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        char al = a.charAt(a.length() - 1);
        char bf = b.charAt(0);
        char bl = b.charAt(b.length() - 1);
        char cf = c.charAt(0);

        println((al == bf) && (bl == cf) ? "YES" : "NO");
    }

    public void print(Object o) {
        System.out.print(o);
    }

    public void println(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
