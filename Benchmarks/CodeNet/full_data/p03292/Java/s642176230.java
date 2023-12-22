import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int A1 = Integer.parseInt(sc.next());
        int A2 = Integer.parseInt(sc.next());
        int A3 = Integer.parseInt(sc.next());
        sc.close();

        int A12 = Math.abs(A1 - A2);
        int A13 = Math.abs(A1 - A3);
        int A23 = Math.abs(A2 - A3);
        int min = Integer.MAX_VALUE;
        // A1
        if (A12 + A23 < min) {
            min = A12 + A23;
        }
        if (A13 + A23 < min) {
            min = A13 + A23;
        }
        // A2
        if (A12 + A13 < min) {
            min = A12 + A13;
        }
        if (A23 + A13 < min) {
            min = A23 + A13;
        }
        // A3
        if (A13 + A12 < min) {
            min = A13 + A12;
        }
        if (A23 + A12 < min) {
            min = A23 + A12;
        }
        out.printf("%d\n", min);
        out.flush();
    }
}
