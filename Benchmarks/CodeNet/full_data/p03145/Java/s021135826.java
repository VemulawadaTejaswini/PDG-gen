import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int AB = Integer.parseInt(sc.next());
        int BC = Integer.parseInt(sc.next());
        int CA = Integer.parseInt(sc.next());
        sc.close();

        out.printf("%d\n", AB * BC / 2);
        out.flush();
    }
}
