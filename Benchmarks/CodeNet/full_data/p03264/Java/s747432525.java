import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int K = Integer.parseInt(sc.next());
        sc.close();
        int odd = (K + 1) / 2;
        int even = K / 2;
        int num = odd * even;

        out.printf("%d\n", num);
        out.flush();
    }
}
