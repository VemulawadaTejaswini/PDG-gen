import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(System.out);

        long a = in.nextLong(), b = in.nextLong(), c = in.nextLong(), d = in.nextLong();
        long gcd = gcd(c, d);
        long right = b - (b/c + b/d) + (b/(c * d/gcd));
        long left = a - 1 - (((a - 1) / c) + ((a - 1) / d)) + ((a - 1)/(c * d/gcd));
        out.println(right - left);
        out.close();
    }

    public static long gcd(long a, long b) {
        if (a == 0 || b == 0) return b + a;
        else return gcd(b, a % b);
    }
}