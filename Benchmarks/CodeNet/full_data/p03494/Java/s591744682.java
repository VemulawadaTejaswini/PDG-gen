import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        long[] a = new long[N];
        int lap = 0;
        for (int i = 0; i < N; i++) {
            a[i] = Long.parseLong(sc.next());
        }
        
        Outer:
        while (true) {
            for (int i = 0; i < N; i++) {
                if (a[i] % 2 != 0) break Outer; 
            }
            for (int i = 0; i < N; i++) {
                a[i] /= 2;
            }
            lap++;
        }
        
        out.println(lap);
        
        out.flush();
    }
}