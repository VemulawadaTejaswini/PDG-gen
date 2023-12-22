import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        int[] br = new int[N-1];
        for (int i = 0; i < N-1; i++) {
            br[i] = Integer.parseInt(sc.next());
        }
        
        int ans = br[0];
        ans += br[N-2];
        for (int i = 1; i < N-1; i++) {
            ans += Math.min(br[i], br[i-1]);
        }
        
        out.println(ans);
        
        out.flush();
    }
}