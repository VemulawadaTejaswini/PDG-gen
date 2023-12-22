import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final long N = Long.parseLong(sc.next());
        long sqrt = (long)Math.sqrt(N);
        long ans = 0;
        
        for (long i = 1; i <= sqrt; i++) {
            if (N % i == 0) {
                ans = N / i + i;
            }
        }
        
        out.println(ans - 2);
        
        out.flush();
    }
}