import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(sc.next());
        if (N == 1) {
            sc.close();

            out.printf("Hello World\n");
        } else {
            int A = Integer.parseInt(sc.next());
            int B = Integer.parseInt(sc.next());
            sc.close();

            out.printf("%d\n", A + B);
        }

        out.flush();
    }
}
