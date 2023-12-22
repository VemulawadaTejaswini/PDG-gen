
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_values = sc.nextInt();
        int X=sc.nextInt();
        int values[] = new int[input_values];
        for (int i = 0; i < input_values; i++) {
            values[i] = Math.abs(sc.nextInt()-X);
        }
        int buf;
        buf=gcd(values[0],values[1]);
        for (int i = 1; i < input_values; i++) {
            buf=gcd(buf,values[i]);
        }
        System.out.println(buf);
    }

    public static int gcd(int a, int b) {
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        int r = -1;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
