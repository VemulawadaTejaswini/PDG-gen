import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        sc.close();

        int trainMin = Math.min(A, B);
        int busMin = Math.min(C, D);

        out.printf("%d\n", trainMin + busMin);
        out.flush();
    }
}
