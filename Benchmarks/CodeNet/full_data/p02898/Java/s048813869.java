import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long K;
        K = sc.nextLong();
        long ans = 0;
        for (int i = 0; i < N; i++) {
           if (sc.nextInt() >= K) ans++;
        }
        System.out.println(ans);
    }
}
