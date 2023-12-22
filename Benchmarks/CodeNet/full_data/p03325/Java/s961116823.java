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
        boolean firstEven = true;
        
        while (true) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0 && firstEven) {
                    a[i] /= 2;
                    firstEven = false;
                } else {
                    a[i] *= 3;
                }
            }
            if (firstEven) {
                break;
            } else {
                firstEven = true;
            }
            ans++;
        }
        
        out.println(ans);
        
        out.flush();
    }
}