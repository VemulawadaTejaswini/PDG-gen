import java.util.stream.IntStream;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        int[] a = IntStream.range(0, N).map(i -> Integer.parseInt(sc.next())).toArray();
        int ans = 0;
        int index = 1;
        
        for (int i = 0; i < N; i++) {
            if (a[i] == index) {
                index++;
            } else if (a[i] != index) {
                ans++;
            }
        }
        
        out.println(index == 1 ? "-1" : ans);
        
        out.flush();
    }
}