import java.util.*;

class AtCoder {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long n, a, b;
        n = in.nextLong();
        a = in.nextLong();
        b = in.nextLong();

        if ((b - a) % 2 == 0)
            System.out.println((b - a) / 2);
        else
            System.out.println(b - 1);
        in.close();
    }
}