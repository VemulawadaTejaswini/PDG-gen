import java.util.*;
import static java.lang.System.out;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int tmp = 0;
        tmp = a;
        a = b;
        b = tmp;
        tmp = a;
        a = c;
        c = tmp;
        System.out.println(a + " " + b + " " + c);

    }
}