import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        sc.close();

        if (A <= 8 && B <= 8) {
            out.printf("Yay!\n");
        } else {
            out.printf(":(\n");
        }
        out.flush();
    }
}
