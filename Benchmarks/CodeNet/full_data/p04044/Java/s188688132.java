import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int L = Integer.parseInt(sc.next());
        String[] S = new String[N];
        String s = "";

        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }

        Arrays.sort(S);

        for (int i = 0; i < N; i++) {
            s += S[i];
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(s);

        sc.close();
        out.flush();
    }
}