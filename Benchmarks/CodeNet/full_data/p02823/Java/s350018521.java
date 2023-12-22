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
            long ans = Math.min(N - A, B - 1);
            System.out.println(ans);
        }
    }

}