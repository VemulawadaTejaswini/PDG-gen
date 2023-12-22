import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        int coin = 0;
        for (int i = 0; i < 2; i++) {
            if (A > B) {
                coin += A;
                A--;
            } else {
                coin += B;
                B--;
            }
        }
        out.printf("%d\n", coin);
        out.flush();
    }
}
