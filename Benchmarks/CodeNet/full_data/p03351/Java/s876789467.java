import java.util.*;
import java.io.*;

public class Main {

    public static void main(final String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if (Math.abs(a - c) <= d || Math.abs(a - b) <= d && Math.abs(b - c) <= d) {
            out.println("YES");
        } else {
            out.println("NO");
        }
    }

}
