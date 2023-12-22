import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve(System.in, System.out);
    }

    public void solve(InputStream in, PrintStream out) {
        Scanner sc = new Scanner(in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        long ra = Math.max(0, a-k);
        long rb = Math.max(Math.min(b, a + b - k), 0);
        out.println(ra + " " + rb);
    }

}
