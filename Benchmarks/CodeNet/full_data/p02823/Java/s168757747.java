import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        long A = in.nextLong();
        long B = in.nextLong();

        if (A > B) {
            long tmp = A;
            A = B;
            B = tmp;
        }

        long diff = (B - A);
        if (diff % 2 == 0) {
            System.out.println(diff / 2);
        } else {
            long diff1 = A - 1;
            long diff2 = N - B;

            long ans = Math.min(B - 1, N - A);
            ans = Math.min(ans, diff1 + 1 + (B - (diff1 + 1) - 1) / 2);
            ans = Math.min(ans, diff2 + 1 + (N - (A + diff2 + 1)) / 2);
            System.out.println(ans);
        }
    }

}