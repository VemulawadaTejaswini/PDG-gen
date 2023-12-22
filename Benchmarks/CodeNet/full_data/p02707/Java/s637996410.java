import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");

        final int N = Integer.parseInt(sc.next());
        int[] ar = new int[N];
        for (int i = 1; i < N; i++) {
            int index = Integer.parseInt(sc.next());
            ar[index - 1]++;
        }
        for (int i = 0; i < N; i++) {
            out.println(ar[i]);
        }
        
        out.flush();
    }
}