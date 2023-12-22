import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in[];
        long a, b, x, ret;
        in = scanner.nextLine().split(" ");
        a = Long.parseLong(in[0]);
        b = Long.parseLong(in[1]);

        if (a == b) {
            System.out.println(a);
            return;
        }

        ret = 0;
        for (long i = a; i < b; i++) {
            ret ^= (i ^ (i+1));
        }

        if ((b - a) % 2 == 0) {
            ret--;
        }
        System.out.println(ret);
    }
}