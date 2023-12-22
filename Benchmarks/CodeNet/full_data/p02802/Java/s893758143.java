import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        final int M = Integer.parseInt(sc.next());
        int[] ac = new int[N];
        int[] wa = new int[N];
        
        for (int i = 0; i < M; i++) {
            int p = Integer.parseInt(sc.next());
            String s = sc.next();
            p--;
            if (ac[p] == 1) {
            } else if (s.equals("AC")) {
                ac[p]++;
            } else {
                wa[p]++;
            }
        }
        int asum = 0;
        int wsum = 0;
        for (int i = 0; i < N; i++) {
            asum += ac[i];
            if (ac[i] == 1) wsum += wa[i];
        }
        
        out.println(asum + " " + wsum);
        
        out.flush();
    }
}