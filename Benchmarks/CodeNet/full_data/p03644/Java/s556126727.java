import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");

        final int N = Integer.parseInt(sc.next());
        int ans;
        if (N == 1) {
            ans = 1;
        } else if (N < 4) {
            ans = 2;
        } else if (N < 8) {
            ans = 4;
        } else if (N < 16) {
            ans = 8;
        } else if (N < 32) {
            ans = 16;
        } else if (N < 64) {
            ans = 32;
        } else {
            ans = 64;
        }
        out.println(ans);

        out.flush();
    }
}