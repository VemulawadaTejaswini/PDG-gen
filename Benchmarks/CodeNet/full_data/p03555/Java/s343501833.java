import com.sun.org.apache.bcel.internal.generic.BIPUSH;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static final void NO() { out.println("NO"); }
    public static final void YES() { out.println("YES"); }

    public static final void main(String[] args) {
        new Main().solve();
        out.flush();
    }

    // ========================================================================= //

    public void solve() {
        char[][] C = new char[2][];
        C[0] = sc.next().toCharArray();
        C[1] = sc.next().toCharArray();
        if (C[0][0] != C[1][2] || C[0][1] != C[1][1] || C[0][2] != C[1][0]) {
            NO();
        }
        else {
            YES();
        }
    }

}

