import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int A = Integer.parseInt(sc.next());
        final int B = Integer.parseInt(sc.next());
        final int C = Integer.parseInt(sc.next());
        final int X = Integer.parseInt(sc.next());
        int ans = 0;
        
        for (int i = 0; i <= A; i++)
            for (int j = 0; j <= B; j++)
                for (int k = 0; k <= C; k++)
                    if (500 * i + 100 * j + 50 * k == X) ++ans;
        
        out.println(ans);
        
        out.flush();
    }
}