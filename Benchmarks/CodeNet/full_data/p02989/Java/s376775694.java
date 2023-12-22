import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 11:16-

            int n = sc.nextInt();
            int[] vs = new int[n];

            for (int i = 0; i < vs.length; i++) vs[i] = sc.nextInt();
            Arrays.sort(vs);

            out.println(vs[vs.length / 2] - vs[vs.length / 2 - 1]);
        }
    }
}
