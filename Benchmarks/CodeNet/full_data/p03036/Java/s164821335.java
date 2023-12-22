import java.util.*;

public class Main {

    private static int r;
    private static int D;
    private static int x2000;

    private static void read() {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        D = sc.nextInt();
        x2000 = sc.nextInt();
    }

    public static void main(String[] args) {
        read();
        int x = x2000;
        for (int i = 0; i < 10; i += 1) {
            x = r * x - D;
            System.out.println(x);
        }
    }
}
