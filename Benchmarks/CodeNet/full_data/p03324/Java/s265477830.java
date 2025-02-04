import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int D = Integer.parseInt(sc.next());
        final int N = Integer.parseInt(sc.next());

        out.println(D == 0 && N == 100 ? "101" : (int)Math.pow(100, D) * N);
        
        out.flush();
    }
}