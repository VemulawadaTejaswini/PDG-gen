import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String b = sc.next();

        if (b.equals("A")) {
            out.printf("T\n");
        } else if (b.equals("T")) {
            out.printf("A\n");
        } else if (b.equals("C")) {
            out.printf("G\n");
        } else if (b.equals("G")) {
            out.printf("C\n");
        }
        out.flush();
    }
}
