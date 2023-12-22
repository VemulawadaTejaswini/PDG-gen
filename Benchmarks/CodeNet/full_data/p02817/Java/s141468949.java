import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve(System.in, System.out);
    }

    public void solve(InputStream in, PrintStream out) {
        Scanner sc = new Scanner(in);
        String s = sc.next();
        String t = sc.next();
        out.println(t + s);
    }

}
