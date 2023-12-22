import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());

        double d = Math.sqrt(a);
        double d2 = d*100000000;
        double e = Math.sqrt(b);
        double e2 = e*100000000;
        double f = Math.sqrt(c);
        double f2 = f*100000000;
        if (d2+e2 < f2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
