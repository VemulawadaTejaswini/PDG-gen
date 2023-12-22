import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        int minus = 0;
        for (int i = a; i <= b; i++) {
            if (i == 0) {
                minus = -1;
                break;
            }
            if (i < 0) {
                minus++;
            }
        }

        if (minus < 0) {
            out.printf("Zero\n");
        } else if (minus % 2 == 0) {
            out.printf("Positive\n");
        } else {
            out.printf("Negative\n");
        }
        out.flush();
    }
}
