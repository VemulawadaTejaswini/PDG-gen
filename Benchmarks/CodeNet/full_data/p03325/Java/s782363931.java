import java.util.stream.IntStream;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        int[] a = IntStream.range(0, N).map(i -> Integer.parseInt(sc.next())).filter(i -> i % 2 == 0).toArray();
        int ans = 0;
        
        for (int i = 0; i < a.length; i++) {
            while (true) {
                a[i] /= 2;
                ans++;
                if (a[i] % 2 != 0) {
                    break;
                }
            }
        }
        
        out.println(ans);
        
        out.flush();
    }
}