import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        final int M = Integer.parseInt(sc.next());
        int[] ar = new int[N];

        for (int i = 0; i < M; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            ar[a - 1]++;
            ar[b - 1]++;
        }
        
        for (int i = 0; i < N; i++) {
            out.println(ar[i]);
        }
        
        out.flush();
    }
}