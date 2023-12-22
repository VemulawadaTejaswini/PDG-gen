import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(sc.next());
        sc.close();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += i;
        }

        out.printf("%d\n", sum);
        out.flush();
    }
}
